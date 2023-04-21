

# CustomerPse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Belvo&#39;s unique ID for the current customer. |  |
|**createdAt** | **OffsetDateTime** | The ISO-8601 timestamp of when the data point was last updated in Belvo&#39;s database. |  |
|**createdBy** | **UUID** | Belvo&#39;s unique ID for the user that created the customer. |  |
|**customerType** | **EnumCustomerType** |  |  |
|**name** | **String** | The full name of the customer.  |  |
|**country** | **EnumPaymentsCountry** |  |  |
|**email** | **String** | The customer&#39;s email address.  |  |
|**identifier** | **String** | The document number of the customer&#39;s ID.  |  |
|**identifierType** | **EnumCustomerIdentifierTypePse** |  |  |
|**address** | **String** | The customers physical address.   **Note:** Apart from the first two and last two characters, all the rest of the characters are masked.  |  [optional] |
|**phone** | **String** | The customer&#39;s phone number.   **Note:** Apart from the first two and last two characters, all the rest of the characters are masked.  |  [optional] |



