# belvo_client.model.invoice_detail_sat.InvoiceDetailSat

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**tax_amount** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The amount of tax for this invoice item (&#x60;pre_tax_amount&#x60; x &#x60;tax_percentage&#x60;). | value must be a 32 bit float
**quantity** | None, decimal.Decimal, int,  | NoneClass, decimal.Decimal,  | The quantity of this invoice item. | value must be a 32 bit integer
**total_amount** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The total price for this invoice item (&#x60;pre_tax_amount&#x60; + &#x60;tax_amount&#x60;). | value must be a 32 bit float
**product_identification** | None, str,  | NoneClass, str,  | The identification code of the product or the service, as defined by the legal entity in the country. - 🇲🇽 [Mexico](http://200.57.3.89/Pys/catPyS.aspx)  | 
**tax_percentage** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The tax percentage to apply. | value must be a 32 bit float
**description** | None, str,  | NoneClass, str,  | The description of the invoice item (an invoice can have one or more items). | 
**unit_code** | None, str,  | NoneClass, str,  | The unit of measure, as defined by the legal entity in the country.  - 🇲🇽 Mexico [SAT catalog reference](https://developers.belvo.com/docs/sat-catalogs#unit-code)  | 
**pre_tax_amount** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The total price for this item before tax is applied (&#x60;quantity&#x60; x &#x60;unit_amount&#x60;). | value must be a 32 bit float
**unit_amount** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The price of one a singular item. | value must be a 32 bit float
**unit_description** | None, str,  | NoneClass, str,  | The description of the item, as defined by the legal entity in the country. - 🇲🇽 Mexico [SAT catalog reference](https://developers.belvo.com/docs/sat-catalogs#unit-code)  | 
**tax_type** | None, str,  | NoneClass, str,  | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  | [optional] 
**[retained_taxes](#retained_taxes)** | list, tuple,  | tuple,  | The retained tax on the invoice item. | [optional] 
**collected_at** | None, str, datetime,  | NoneClass, str,  | The ISO-8601 timestamp when the data point was collected. | [optional] value must conform to RFC-3339 date-time
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# retained_taxes

The retained tax on the invoice item.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | The retained tax on the invoice item. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**InvoiceDetailRetainedTaxSat**](InvoiceDetailRetainedTaxSat.md) | [**InvoiceDetailRetainedTaxSat**](InvoiceDetailRetainedTaxSat.md) | [**InvoiceDetailRetainedTaxSat**](InvoiceDetailRetainedTaxSat.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

