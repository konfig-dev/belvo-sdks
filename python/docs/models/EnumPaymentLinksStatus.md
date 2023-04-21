# belvo_client.model.enum_payment_links_status.EnumPaymentLinksStatus

The current status of the payment link. Can be either:    - `ACTIVE` meaning that the payment intent's status is either `REQUIRES_PAYMENT_METHOD`, `REQUIRES_ACTION`, or `PROCESSING`.   - `INACTIVE` meaning that the payment intent's status is either `SUCCEEDED` or `FAILED`.  **Note:** You can retrieve the complete payment intent by using our [Get details of a payment link](https://developers.belvo.com/reference/detailcreatepaymentlink) request. 

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  | The current status of the payment link. Can be either:    - &#x60;ACTIVE&#x60; meaning that the payment intent&#x27;s status is either &#x60;REQUIRES_PAYMENT_METHOD&#x60;, &#x60;REQUIRES_ACTION&#x60;, or &#x60;PROCESSING&#x60;.   - &#x60;INACTIVE&#x60; meaning that the payment intent&#x27;s status is either &#x60;SUCCEEDED&#x60; or &#x60;FAILED&#x60;.  **Note:** You can retrieve the complete payment intent by using our [Get details of a payment link](https://developers.belvo.com/reference/detailcreatepaymentlink) request.  | must be one of ["ACTIVE", "INACTIVE", ] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

