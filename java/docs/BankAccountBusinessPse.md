

# BankAccountBusinessPse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Belvo&#39;s unique ID for the current bank account. |  |
|**createdAt** | **OffsetDateTime** | The ISO-8601 timestamp of when the data point was first created in Belvo&#39;s database. |  |
|**createdBy** | **UUID** | Belvo&#39;s unique ID for the user that created the bank account. |  |
|**customer** | **UUID** | Belvo&#39;s unique ID for the customer associated with the bank account. For &#x60;BUSINESS&#x60; bank accounts, this field is &#x60;null&#x60;. |  |
|**institution** | **UUID** | Belvo&#39;s unique ID for the institution that the bank account is created in. For &#x60;BUSINESS&#x60; bank accounts that Belvo creates for organizations, this field is &#x60;null&#x60;. |  |
|**number** | **String** | The bank account number. For &#x60;BUSINESS&#x60; bank accounts that Belvo creates for organizations, this field is &#x60;null&#x60;.  **Note:** Apart from the last four characters, all the rest of the characters are masked. |  |
|**holder** | [**HolderBusinessResponsePse**](HolderBusinessResponsePse.md) |  |  |
|**details** | **Object** | For PSE, this field will return an empty object. |  |
|**metadata** | **Object** | Optional and customizable object where you can provide any additional key-value pairs for your internal purposes. For example, an internal reference number for the payment intent.  ⚠️ **Note**: You can only provide up to 50 keys (keys can have up to 50 characters each and each value can be up to 500 characters). We do not support nested objects, only ASCII values. |  [optional] |



