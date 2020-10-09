import pandas as pd
import matplotlib.pyplot as plt
import matplotlib as mpl
import seaborn
import os

get_ipython().run_line_magic("matplotlib", " inline")
mpl.rcParams["axes.unicode_minus"] = False
mpl.rcParams["font.family"] = "D2Coding"


os.listdir()


df = pd.read_csv("./msft.csv")
df["Date"] = pd.to_datetime(df["Date"])


df.head()


df.columns


df["Price"]


df["Price"] = df["Price"].str.replace("Free","0")
df["Price"] = df["Price"].str.replace("₹ ","")
df["Price"] = df["Price"].str.replace(",","")


df["Price"]


df.tail()


df = df.dropna()


df.tail()


df.shape


df["Price"] = pd.to_numeric(df["Price"])


    
