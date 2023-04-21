

# BankAccountOfpiResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Belvo&#39;s unique ID for the current bank account. |  |
|**createdAt** | **OffsetDateTime** | The ISO-8601 timestamp of when the data point was last updated in Belvo&#39;s database. |  |
|**createdBy** | **UUID** | Belvo&#39;s unique ID for the user that created the bank account. |  |
|**customer** | **UUID** | Belvo&#39;s unique ID for the customer associated with the bank account. For &#x60;BUSINESS&#x60; bank accounts, this field is &#x60;null&#x60;. |  |
|**institution** | **UUID** | Belvo&#39;s unique ID for the institution that the bank account is created in. For &#x60;BUSINESS&#x60; bank accounts that Belvo creates for organizations, this field is &#x60;null&#x60;. |  |
|**details** | **Object** |  |  |
|**holder** | [**HolderResponseOfpi**](HolderResponseOfpi.md) |  |  |



