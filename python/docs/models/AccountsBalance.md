# belvo_client.model.accounts_balance.AccountsBalance

Details regarding the current and available balances for the account. 

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Details regarding the current and available balances for the account.  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**current** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The current balance is calculated differently according to the type of account.  - **💰 Checking and saving accounts**:  The user&#x27;s account balance at the &#x60;collected_at&#x60; timestamp. - **💳 Credit cards**:  The amount the user has spent in the current card billing period (see &#x60;credit_data.cutting_date&#x60; for information on when the current billing period finishes). - **🏡 Loan accounts**:  The amount remaining to pay on the users&#x27;s loan (same as &#x60;loan_data.outstanding_balance&#x60;). | value must be a 32 bit float
**available** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The balance that the account owner can use. - **💰 Checking and saving accounts**:  The available balance may be different to the &#x60;current&#x60; balance due to pending transactions. - **💳 Credit cards**:  The credit amount the user still has available for the current period. The amount is calculated as &#x60;credit_data.credit_limit&#x60; minus &#x60;balance.current&#x60;. - **🏡 Loan accounts**:  The present value required to pay off the loan, as provided by the institution.  **Note:** If the institution does not provide this value, we return &#x60;null&#x60;. | [optional] value must be a 32 bit float
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

