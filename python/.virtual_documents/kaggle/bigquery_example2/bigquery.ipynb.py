from google.cloud import bigquery
import matplotlib.pyplot as plt
import seaborn as sns
import matplotlib as mpl

get_ipython().run_line_magic("matplotlib", " inline")
mpl.rcParams["axes.unicode_minus"] = False
mpl.rcParams["font.family"] = 'D2Coding'


client = bigquery.Client(project="bigquery-public-data")


[i.dataset_id for i in client.list_datasets()]


dataset = client.get_dataset(client.dataset("covid19_open_data"))
dataset


[i.table_id for i in client.list_tables(dataset)]


table = client.get_table(dataset.table("covid19_open_data"))
table


table.num_rows


sql = """SELECT * FROM `bigquery-public-data.covid19_open_data.covid19_open_data` limit 5000"""


client2 = bigquery.Client()
df = client2.query(sql).to_dataframe()


df.head()


df.shape



