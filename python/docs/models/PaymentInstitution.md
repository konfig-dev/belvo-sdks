# belvo_client.model.payment_institution.PaymentInstitution

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**id** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID to reference the institution. | [optional] value must be a uuid
**active** | bool,  | BoolClass,  | Indicates whether this institution is available for use or not. | [optional] 
**name** | str,  | str,  | The name of the institution, as designated by Belvo. | [optional] 
**display_name** | str,  | str,  | The customer-facing name of the institution. | [optional] 
**website** | str,  | str,  | The URL of the institution&#x27;s website. | [optional] 
**logo** | str,  | str,  | The URL of the institution&#x27;s logo. | [optional] 
**icon_logo** | str,  | str,  | The URL of the institution&#x27;s icon logo. | [optional] 
**text_logo** | str,  | str,  | The URL of the institution&#x27;s text logo. | [optional] 
**primary_color** | str,  | str,  | The primary color on the institution&#x27;s website. | [optional] 
**country** | [**EnumPaymentsCountry**](EnumPaymentsCountry.md) | [**EnumPaymentsCountry**](EnumPaymentsCountry.md) |  | [optional] 
**[form_fields](#form_fields)** | list, tuple,  | tuple,  |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# form_fields

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**InstitutionFormField**](InstitutionFormField.md) | [**InstitutionFormField**](InstitutionFormField.md) | [**InstitutionFormField**](InstitutionFormField.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

