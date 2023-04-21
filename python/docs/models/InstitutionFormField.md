# belvo_client.model.institution_form_field.InstitutionFormField

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**name** | str,  | str,  | The username, password, or username type field. | [optional] 
**type** | str,  | str,  | The input type for the form field. For example, string. | [optional] 
**label** | str,  | str,  | The label of the form field. For example: - Document - Clave - Token  | [optional] 
**validation** | str,  | str,  | The type of input validation used for the field. | [optional] 
**placeholder** | str,  | str,  | The placeholder text in the form field. | [optional] 
**validation_message** | str,  | str,  | The message displayed when an invalid input is provided in the form field. | [optional] 
**[values](#values)** | list, tuple,  | tuple,  | Array of additional form field values. | [optional] 
**length** | decimal.Decimal, int,  | decimal.Decimal,  | Number of digits allowed when the type is &#x60;token&#x60;. | [optional] 
**optional** | bool,  | BoolClass,  | It indicates whether this form field is optional. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# values

Array of additional form field values.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | Array of additional form field values. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**InstitutionsFormFieldValues**](InstitutionsFormFieldValues.md) | [**InstitutionsFormFieldValues**](InstitutionsFormFieldValues.md) | [**InstitutionsFormFieldValues**](InstitutionsFormFieldValues.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

