# belvo_client.model.net_income_individual.NetIncomeIndividual

Object containing the declared net income of the tax payer. The values are calculated as the `gross_income` - `non_taxable_income`.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Object containing the declared net income of the tax payer. The values are calculated as the &#x60;gross_income&#x60; - &#x60;non_taxable_income&#x60;. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**non_labor_income** | decimal.Decimal, int, float,  | decimal.Decimal,  | Income that cannot be classified into the other three fields (such as income from cryptocurrencies or regular transfers from parents). | value must be a 32 bit float
**earned_income** | decimal.Decimal, int, float,  | decimal.Decimal,  | Income received from employment. | value must be a 32 bit float
**fee_based_income** | decimal.Decimal, int, float,  | decimal.Decimal,  | Income received from emitted invoices (for example, income independent contractors or freelancers receive). | value must be a 32 bit float
**capital_income** | decimal.Decimal, int, float,  | decimal.Decimal,  | Income received from an investment (such as dividends or from renting a property). | value must be a 32 bit float
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

