# belvo_client.model.enum_link_access_mode_request.EnumLinkAccessModeRequest

The type of link to create.  - Use `single` to do ad hoc one-time POST requests for accounts, owners, and transactions. - Use `recurrent` to have Belvo access information on a recurrent basis so you always have fresh account, owner, balance, and transaction data.  For more information, see our [Links](https://developers.belvo.com/docs/links-and-institutions#links) article. 

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  | The type of link to create.  - Use &#x60;single&#x60; to do ad hoc one-time POST requests for accounts, owners, and transactions. - Use &#x60;recurrent&#x60; to have Belvo access information on a recurrent basis so you always have fresh account, owner, balance, and transaction data.  For more information, see our [Links](https://developers.belvo.com/docs/links-and-institutions#links) article.  | must be one of ["single", "recurrent", ] if omitted the server will use the default value of "recurrent"

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

