# belvo_client.model.tax_returns_monthly_request.TaxReturnsMonthlyRequest

Request body for monthly tax returns

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Request body for monthly tax returns | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**link** | str, uuid.UUID,  | str,  | The fiscal &#x60;link.id&#x60; you want specific tax return information for. | value must be a uuid
**date_to** | str,  | str,  | The date you want to stop getting tax returns for, in &#x60;YYYY-MM-DD&#x60; format.  ⚠️ The value of &#x60;date_to&#x60; cannot be greater than today&#x27;s date (in other words, no future dates). | 
**type** | str,  | str,  | The type of tax return to return. For monthly tax returns, this field must be set to &#x60;monthly&#x60;.  | if omitted the server will use the default value of "monthly"
**date_from** | str,  | str,  | The starting date you want to get tax returns for, in &#x60;YYYY-MM-DD&#x60; format.  ⚠️ The value of &#x60;date_from&#x60; cannot be greater than &#x60;date_to&#x60;. | 
**attach_pdf** | bool,  | BoolClass,  | When this is set to &#x60;true&#x60;, you will receive the PDF as a binary string in the response. | [optional] if omitted the server will use the default value of False
**save_data** | bool,  | BoolClass,  | Indicates whether or not to persist the data in Belvo. By default, this is set to &#x60;true&#x60; and we return a 201 Created response. When set to &#x60;false&#x60;, the data won&#x27;t be persisted and we return a 200 OK response. | [optional] if omitted the server will use the default value of True
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

