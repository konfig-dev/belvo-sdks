# belvo_client.model.invoice_sender_details_dian.InvoiceSenderDetailsDian

Details regarding the sender. 

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Details regarding the sender.  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**collected_at** | None, str, datetime,  | NoneClass, str,  | The ISO-8601 timestamp when the data point was collected. | [optional] value must conform to RFC-3339 date-time
**tax_payer_type** | None, str,  | NoneClass, str,  | Indicates if the sender is a business or an individual. Can be either:      - &#x60;Persona Jurídica&#x60;   - &#x60;Persona Natural&#x60;  | [optional] 
**regimen** | None, str,  | NoneClass, str,  | The sender&#x27;s regimen type.  For detailed information regarding DIAN&#x27;s regimens, please see their [official PDF](https://www.dian.gov.co/impuestos/factura-electronica/Documents/Anexo_tecnico_factura_electronica_vr_1_7_2020.pdf).   | [optional] 
**tax_scheme** | None, str,  | NoneClass, str,  | The sender&#x27;s fiscal responsibilities.  For detailed information regarding DIAN&#x27;s tax schemes, please see their [official PDF](https://www.dian.gov.co/impuestos/factura-electronica/Documents/Anexo_tecnico_factura_electronica_vr_1_7_2020.pdf).   | [optional] 
**country** | None, str,  | NoneClass, str,  | The country where the sender pays their taxes.  | [optional] 
**address** | None, str,  | NoneClass, str,  | The sender&#x27;s address.  | [optional] 
**phone_number** | None, str,  | NoneClass, str,  | The sender&#x27;s phone number.  | [optional] 
**email** | None, str,  | NoneClass, str,  | The sender&#x27;s email address.  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

