import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt
import matplotlib as mpl
from warnings import filterwarnings

filterwarnings(action="ignore")
get_ipython().run_line_magic("matplotlib", " inline")
mpl.rcParams["axes.unicode_minus"] = False
mpl.rcParams["font.family"] = "D2Coding"


df = pd.read_csv("e:/study_repos/python/kaggle/gro/Groceries_dataset.csv")


df.head()


df.info()


df["Date"] = df["Date"].apply(pd.to_datetime)


df.info()


df.head()


df.nunique()


df.describe()


df["itemDescription"].value_counts()


df.shape


df["Member_number"].value_counts()


df.columns


df["Date"].value_counts().plot(kind="line")


item = df["itemDescription"].unique()


# item을 분류해본다
# >> 유제품, 과일, 빵, 고기, 야채, 생선, 냉동식품, 주류


item.shape



