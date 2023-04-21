# belvo_client.model.payment_link_pse.PaymentLinkPse

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**payment_url** | str,  | str,  | The URL for the hosted-widget that will guide your user through the payments process. | 
**expires_at** | str, datetime,  | str,  | The ISO-8601 timestamp of when the payment link is set to expire.  | value must conform to RFC-3339 date-time
**callback_urls** | [**PaymentLinkCallbackUrlsResponse**](PaymentLinkCallbackUrlsResponse.md) | [**PaymentLinkCallbackUrlsResponse**](PaymentLinkCallbackUrlsResponse.md) |  | 
**created_at** | str, datetime,  | str,  | The ISO-8601 timestamp of when the data point was last updated in Belvo&#x27;s database. | value must conform to RFC-3339 date-time
**id** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID for the current payment link. | value must be a uuid
**created_by** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID for the user that created the payment link. | value must be a uuid
**expires_in** | str,  | str,  | The payment link expiration time.  | 
**status** | [**EnumPaymentLinksStatus**](EnumPaymentLinksStatus.md) | [**EnumPaymentLinksStatus**](EnumPaymentLinksStatus.md) |  | 
**access_token** | str,  | str,  | The Belvo-generated access token for the payment link.  **Note:** You&#x27;ll need the &#x60;access_token&#x60; to make [Get details for a payment link](https://developers.belvo.com/reference/detailcreatepaymentlink) requests. | [optional] 
**payment_intent** | [**PaymentIntentPse**](PaymentIntentPse.md) | [**PaymentIntentPse**](PaymentIntentPse.md) |  | [optional] 
**updated_at** | None, str, datetime,  | NoneClass, str,  | The ISO-8601 timestamp of when the payment link was last updated.  | [optional] value must conform to RFC-3339 date-time
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

