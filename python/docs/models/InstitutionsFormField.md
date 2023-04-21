# belvo_client.model.institutions_form_field.InstitutionsFormField

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**name** | str,  | str,  | The username, password, or username type field. | [optional] 
**type** | str,  | str,  | The input type for the form field. For example, string. | [optional] 
**label** | str,  | str,  | The label of the form field. For example: - Client number - Key Bancanet - Document  | [optional] 
**validation** | str,  | str,  | The type of input validation used for the field. | [optional] 
**placeholder** | str,  | str,  | The placeholder text in the form field. | [optional] 
**validation_message** | str,  | str,  | The message displayed when an invalid input is provided in the form field. | [optional] 
**[values](#values)** | list, tuple,  | tuple,  | If the form field is for documents, the institution may require additional input regarding the document type. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# values

If the form field is for documents, the institution may require additional input regarding the document type.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | If the form field is for documents, the institution may require additional input regarding the document type. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**InstitutionsFormFieldValues**](InstitutionsFormFieldValues.md) | [**InstitutionsFormFieldValues**](InstitutionsFormFieldValues.md) | [**InstitutionsFormFieldValues**](InstitutionsFormFieldValues.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

