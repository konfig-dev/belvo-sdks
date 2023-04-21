

# PaymentLinkCallbackUrlsResponse

The URLs that the user should be redirected to.  **Note:** This field will return an empty object if your integration only generates payment links through the [Belvo Dashboard](https://dashboard.belvo.com/).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cancel** | **String** | The URL that the user should be redirected to if they decide to cancel the payment process or if an error occurs. |  [optional] |
|**success** | **String** | The URL that the user should be redirected to when they complete the payment process successfully. |  [optional] |



