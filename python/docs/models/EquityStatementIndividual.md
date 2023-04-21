# belvo_client.model.equity_statement_individual.EquityStatementIndividual

Object containing the general fiscal situation of the taxpayer.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Object containing the general fiscal situation of the taxpayer. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**total_net_equity** | decimal.Decimal, int, float,  | decimal.Decimal,  | The total net equity value of the taxpayer. | value must be a 32 bit float
**total_debts** | decimal.Decimal, int, float,  | decimal.Decimal,  | The total debts of the tax_payer | value must be a 32 bit float
**total_gross_equity** | decimal.Decimal, int, float,  | decimal.Decimal,  | The total gross equity of the tax payer. | value must be a 32 bit float
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

