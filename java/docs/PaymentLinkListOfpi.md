

# PaymentLinkListOfpi


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Belvo&#39;s unique ID for the current payment link. |  |
|**createdAt** | **OffsetDateTime** | The ISO-8601 timestamp of when the data point was last updated in Belvo&#39;s database. |  |
|**createdBy** | **UUID** | Belvo&#39;s unique ID for the user that created the payment link. |  |
|**paymentUrl** | **String** | The URL for the hosted-widget that will guide your user through the payments process. |  |
|**accessToken** | **String** | The Belvo-generated access token for the payment link.  **Note:** You&#39;ll need the &#x60;access_token&#x60; to make [Get details for a payment link](https://developers.belvo.com/reference/detailcreatepaymentlink) requests. |  [optional] |
|**callbackUrls** | [**PaymentLinkCallbackUrlsResponse**](PaymentLinkCallbackUrlsResponse.md) |  |  |
|**paymentIntent** | **UUID** | Belvo&#39;s unique ID for the payment intent. You can retrieve the complete payment intent by using our [Get details of a payment link](https://developers.belvo.com/reference/detailcreatepaymentlink) request. |  [optional] |
|**updatedAt** | **OffsetDateTime** | The ISO-8601 timestamp of when the payment link was last updated.  |  [optional] |
|**status** | **EnumPaymentLinksStatus** |  |  |
|**expiresIn** | **String** | The payment link expiration time.   |  |
|**expiresAt** | **OffsetDateTime** | The ISO-8601 timestamp of when the payment link is set to expire.  |  |



