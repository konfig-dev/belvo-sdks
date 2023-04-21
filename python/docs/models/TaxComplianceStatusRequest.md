# belvo_client.model.tax_compliance_status_request.TaxComplianceStatusRequest

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**link** | str, uuid.UUID,  | str,  | The fiscal &#x60;link.id&#x60; to use. | value must be a uuid
**attach_pdf** | bool,  | BoolClass,  | When set to &#x60;true&#x60;, you will receive the PDF in binary format in the response. | [optional] if omitted the server will use the default value of False
**save_data** | bool,  | BoolClass,  | Indicates whether or not to persist the data in Belvo. By default, this is set to &#x60;true&#x60; and we return a 201 Created response. When set to &#x60;false&#x60;, the data won&#x27;t be persisted and we return a 200 OK response. | [optional] if omitted the server will use the default value of True
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

