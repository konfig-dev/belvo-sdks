# belvo_client.model.tax_status_economic_activity_dian.TaxStatusEconomicActivityDian

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**economic_activity** | None, str,  | NoneClass, str,  | The economic activity code, according to the fiscal institution.  For detailed information regarding DIAN&#x27;s economic activities, please see their [official PDF](https://www.dian.gov.co/impuestos/factura-electronica/Documents/Anexo_tecnico_factura_electronica_vr_1_7_2020.pdf).   | [optional] 
**initial_date** | None, str, date,  | NoneClass, str,  | The start date of the economic activity. | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD
**end_date** | None, str, date,  | NoneClass, str,  | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD
**order** | None, str,  | NoneClass, str,  | The order of the economic activity. | [optional] 
**percentage** | None, str,  | NoneClass, str,  | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

