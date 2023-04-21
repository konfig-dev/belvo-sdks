# belvo_client.model.enum_transaction_bill_status.EnumTransactionBillStatus

The status of the bill that the transaction appears on. Can be one of:    - `PAID`: The bill has been paid in full.   - `CLOSED`: The bill has been closed by the institution.   - `OPEN`: The bill is currently open. (Note: This is the main bill that Belvo retrieves balance data from).   - `FUTURE`: The bill is pending.   - `null`: No bill status was identified.     ℹ️ Note: Some banks consider CLOSED as PAID. 

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, str,  | NoneClass, str,  | The status of the bill that the transaction appears on. Can be one of:    - &#x60;PAID&#x60;: The bill has been paid in full.   - &#x60;CLOSED&#x60;: The bill has been closed by the institution.   - &#x60;OPEN&#x60;: The bill is currently open. (Note: This is the main bill that Belvo retrieves balance data from).   - &#x60;FUTURE&#x60;: The bill is pending.   - &#x60;null&#x60;: No bill status was identified.     ℹ️ Note: Some banks consider CLOSED as PAID.  | must be one of ["PAID", "CLOSED", "OPEN", "FUTURE", None, ] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

