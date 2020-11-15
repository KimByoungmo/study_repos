import pandas as pd
import matplotlib.pyplot as plt
import matplotlib as mpl
import seaborn as sns
import numpy as np

mpl.rcParams["axes.unicode_minus"] = False
mpl.rcParams["font.family"] = "D2Coding"


df = pd.read_csv("e:/study_repos/python/kaggle/netflix/netflix_titles.csv")

df.head()


df.nunique()



