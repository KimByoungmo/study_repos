#loading packages
import pandas as pd
import numpy as np
import matplotlib as mpl
import matplotlib.pyplot as plt
import seaborn as sns
from google.cloud import bigquery

client = bigquery.Client()

client.project

client.list_datasets()

[i.dataset_id for i in client.list_datasets()]

dataset = client.get_dataset(client.dataset("medicare"))
dataset

[i.table_id for i in client.list_tables(dataset)]

table = client.get_table(dataset.table("inpatient_charges_2014"))
table

dir(table)

table.num_rows

table.schema

df = client.list_rows(table).to_dataframe()

df.head()

df.tail()

"""1) drg_definition 칼럼 정제,
   2) average_covered_charges, average_total_payments,
      average_medicare_payments 소수점 조절"""
