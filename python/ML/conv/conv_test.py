import matplotlib.pyplot as plt
import numpy as np
import tensorflow as tf

filename = "e:/workplace/python/ML/conv/a.jpg"
image = plt.imread(filename)
plt.show(plt.imshow(image))
image = tf.constant(image, dtype=tf.float32)

filter = np.array([[[1, 1, 0], [0, 0, 0], [1, 1, 0]], [[1, 1, 0], [
    5, 0, 0], [-1, -1, 0]], [[1, 0, 0], [0, 1, 0], [-1, -1, 0]]])
filter = tf.constant(filter, dtype=tf.float32)


def calculate_shape(image_size, padding, filter_size, strides, dilation):
    return (image_size + 2 * padding - dilation * (filter_size - 1) - 1) / strides + 1


def convert(image, filter):
    x = tf.expand_dims(image, 0)
    y = tf.expand_dims(filter, 0)
    return tf.nn.conv2d(input=x, filter=y, strides=[1, 1, 1, 1], padding="SAME", data_format="NHWC")


def convert_dtype(array, dtype):
    return np.asarray(array, dtype)


converted_image = convert(image, filter)

with tf.Session() as session:
    tf.summary.merge_all()
    # Fw = tf.summary.FileWriter(
    #    logdir="e:/workplace/python/ML/conv/log_dir", graph=session.graph)
    i = session.run(converted_image)
    i = np.squeeze(i, 0)
    #print(i, i.dtype)
    #print(np.asarray(i, np.uint8))
    plt.show(plt.imshow(convert_dtype(i, "uint8")))
    