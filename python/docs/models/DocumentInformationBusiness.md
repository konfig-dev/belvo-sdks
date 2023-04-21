# belvo_client.model.document_information_business.DocumentInformationBusiness

Object containing detailed information about the fiscal document.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Object containing detailed information about the fiscal document. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**year** | None, decimal.Decimal, int,  | NoneClass, decimal.Decimal,  | The year of this tax declaration.  | 
**name** | str,  | str,  | The name of the tax document. | 
**type** | str,  | str,  | The type of tax declaration form. For DIAN, this will be either &#x60;110&#x60; or &#x60;210&#x60;. | 
**form_number** | str,  | str,  | The institution-provided identifier for the tax declaration. | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

