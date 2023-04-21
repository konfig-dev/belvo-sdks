# belvo_client.model.tax_payer_information_individual.TaxPayerInformationIndividual

Object containing information about the tax payer.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Object containing information about the tax payer. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**main_economic_activity** | str,  | str,  | The main economic activity the tax payer is involved in. | 
**other_names** | str,  | str,  | Additional names of the tax payer. | 
**reporting_id** | [**ReportingId**](ReportingId.md) | [**ReportingId**](ReportingId.md) |  | 
**document_id** | [**DocumentIdIndividual**](DocumentIdIndividual.md) | [**DocumentIdIndividual**](DocumentIdIndividual.md) |  | 
**first_last_name** | str,  | str,  | The tax payer&#x27;s first last name. | 
**first_name** | str,  | str,  | The tax payer&#x27;s first name. | 
**second_last_name** | str,  | str,  | The tax payer&#x27;s second last name. | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

