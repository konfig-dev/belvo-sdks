# belvo_client.model.payment_link_callback_urls_response.PaymentLinkCallbackUrlsResponse

The URLs that the user should be redirected to.  **Note:** This field will return an empty object if your integration only generates payment links through the [Belvo Dashboard](https://dashboard.belvo.com/).

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | The URLs that the user should be redirected to.  **Note:** This field will return an empty object if your integration only generates payment links through the [Belvo Dashboard](https://dashboard.belvo.com/). | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**cancel** | str,  | str,  | The URL that the user should be redirected to if they decide to cancel the payment process or if an error occurs. | [optional] 
**success** | str,  | str,  | The URL that the user should be redirected to when they complete the payment process successfully. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

