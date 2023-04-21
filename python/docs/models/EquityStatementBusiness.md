# belvo_client.model.equity_statement_business.EquityStatementBusiness

Object containing the general fiscal situation of the taxpayer.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Object containing the general fiscal situation of the taxpayer. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**debts** | decimal.Decimal, int, float,  | decimal.Decimal,  | Total debts that the company currently has. | value must be a 32 bit float
**property_plant_and_equipment_investment_properties** | decimal.Decimal, int, float,  | decimal.Decimal,  | Total value of real estate, plant infrastructure, or equipment that has been purchased. | value must be a 32 bit float
**cash_and_cash_equivalents** | decimal.Decimal, int, float,  | decimal.Decimal,  | Total cash (or cash equivalents) that the business currently holds at the end of the fiscal year. | value must be a 32 bit float
**accounts_documents_and_finance_leases_receivable** | decimal.Decimal, int, float,  | decimal.Decimal,  | Total of all payments the company expects to receive (for example, from partial invoices that have not been paid yet). | value must be a 32 bit float
**investments_and_derivative_financial_instruments** | decimal.Decimal, int, float,  | decimal.Decimal,  | Total value of all investments, stocks, or similar, that the company has. | value must be a 32 bit float
**inventory** | decimal.Decimal, int, float,  | decimal.Decimal,  | Total financial value of the company&#x27;s sellable inventory. | value must be a 32 bit float
**total_net_equity** | decimal.Decimal, int, float,  | decimal.Decimal,  | The total net equity of the company (&#x60;total_gross_equity&#x60; - &#x60;debts&#x60;). | value must be a 32 bit float
**total_gross_equity** | decimal.Decimal, int, float,  | decimal.Decimal,  | Total gross equity. | value must be a 32 bit float
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

