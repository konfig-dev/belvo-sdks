# belvo_client.model.transaction_merchant_data.TransactionMerchantData

Additional data regarding the merchant involved in the transaction. We only return merchant information for new transactions made from *checking* or *credit card* accounts. > **Get merchant information**  We retrieve the merchant information for a transaction as part of our [Transaction categorization](https://developers.belvo.com/docs/banking#categorizing-transactions) product, turning raw data into actionable insights. To enable this product, just [reach out](https://belvo.com/contact/?utm_source=documentation) to us, and we'll get right to it. 

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Additional data regarding the merchant involved in the transaction. We only return merchant information for new transactions made from *checking* or *credit card* accounts. &gt; **Get merchant information**  We retrieve the merchant information for a transaction as part of our [Transaction categorization](https://developers.belvo.com/docs/banking#categorizing-transactions) product, turning raw data into actionable insights. To enable this product, just [reach out](https://belvo.com/contact/?utm_source&#x3D;documentation) to us, and we&#x27;ll get right to it.  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**logo** | None, str,  | NoneClass, str,  | The URL to the merchant&#x27;s logo. | [optional] 
**website** | None, str,  | NoneClass, str,  | The URL to the merchant&#x27;s website. | [optional] 
**merchant_name** | str,  | str,  | The name of the merchant. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

