import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt

get_ipython().run_line_magic("matplotlib", " inline")


client = bigquery.Client()
client


[i.dataset_id for i in client.list_datasets()]


dataset = client.get_dataset(client.dataset("new_york_subway"))
dataset


[i.table_id for i in client.list_tables(dataset)]


table_routes = client.get_table(dataset.table("routes"))
table_routes


routes = client.list_rows(table_routes).to_dataframe()
routes.head()


table_stations = client.get_table(dataset.table("stations"))
table_stations


stations = client.list_rows(table_stations).to_dataframe()


stations.head()


stations["line"].unique()


routes["route_long_name"].unique()


table_trips = client.get_table(dataset.table("trips"))
table_trips


trips = client.list_rows(table_trips).to_dataframe()


trips.head()


stations.head()


stations["daytime_routes"].str.split(" ").apply(len).max()


result = pd.DataFrame()
for i,j in enumerate(stations["daytime_routes"]) :
    t = j.split(" ")
    temp = pd.DataFrame({"index":[i]*len(t), "daytime_routes":t})
    result = pd.concat([result, temp])


result


result = result.set_index(["index"])


result.head()


stations.head()


stations = stations.merge(result,how="left",left_index=True, right_index=True)


stations.head()


routes.head()


routes["route_short_name"].value_counts()



