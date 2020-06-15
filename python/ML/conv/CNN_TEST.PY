import torch
from torch import nn, optim
from torchvision import datasets, transforms
import tensorflow as tf

# import fashion dataset
dataset = datasets.FashionMNIST(
    root="e:/workplace/python/ML/conv", download=True, train=True
)

train_data, train_target, target_class = dataset.data, dataset.targets, dataset.classes
test_data = train_data[600:603]
test_target = train_target[600:603]
train_data = train_data[0:500]
train_target = train_target[0:500]


class Conv(nn.Module):
    def __init__(self, c_in, c_out):
        super().__init__()
        self.c_in = c_in
        self.c_out = c_out
        self.conv2d_1 = nn.Conv2d(in_channels=self.c_in, out_channels=30,
                                  kernel_size=2, stride=1, padding=0, dilation=1, bias=True)
        self.relu = nn.ReLU()
        self.maxpool = nn.MaxPool2d(
            kernel_size=4, stride=1, dilation=1, padding=0)
        self.conv2d_2 = nn.Conv2d(in_channels=30, out_channels=10,
                                  kernel_size=2, stride=1, padding=0, dilation=1, bias=True)
        self.linear = nn.Linear(10*20*20, c_out)

    def Calculation_shape(self, i, padding, dilation, kernel_size, stride):
        return (i+2*padding-dilation*(kernel_size-1)-1)/stride+1

    def forward(self, input):
        result = self.conv2d_1(input)
        result = self.relu(result)
        result = self.maxpool(result)
        result = self.conv2d_2(result)
        result = self.relu(result)
        result = self.maxpool(result)
        result = result.view(-1, 10*20*20)
        result = self.linear(result)
        return result

    def predict(self, input):
        result = self.forward(input)
        return torch.argmax(result, 1)


def toTensor(input):
    to_tensor = transforms.ToTensor()
    return to_tensor(input)


def toPILImage(input):
    to_PILImage = transforms.ToPILImage()
    return to_PILImage(input)


loss_fn = nn.CrossEntropyLoss()
conv = Conv(1, 10)
optimizer = optim.SGD(conv.parameters(), lr=1e-3)
result = []
train_data = train_data.float()
train_data.unsqueeze_(1)

for i in range(10):
    y_pred = conv(train_data)
    optimizer.zero_grad()
    loss = loss_fn(y_pred, train_target)
    print(loss.item())
    loss.backward()
    optimizer.step()
    result.append(list(conv.parameters())[0].clone().detach())
