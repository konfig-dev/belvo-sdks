

# Balance


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Belvo&#39;s unique ID for the balance request. |  [optional] |
|**account** | [**Account**](Account.md) |  |  [optional] |
|**valueDate** | **LocalDate** | The date when the &#x60;balance&#x60; was available, in &#x60;YYYY-MM-DD&#x60; format. |  [optional] |
|**balance** | **Float** | The funds available in the account by the end of the &#x60;value_date&#x60;. |  [optional] |
|**currentBalance** | **Double** | *This field has been deprecated. Please use the &#x60;balance&#x60; field instead.*  |  [optional] |
|**statement** | **String** | *This field has been deprecated.*  *The ID of the banking statement used to extract the &#x60;balance&#x60;.*  |  [optional] |
|**collectedAt** | **OffsetDateTime** | This field has been deprecated.  The ISO-8601 timestamp when the data point was collected.  |  [optional] |



