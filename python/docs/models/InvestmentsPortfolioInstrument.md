# belvo_client.model.investments_portfolio_instrument.InvestmentsPortfolioInstrument

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**open_date** | None, str, date,  | NoneClass, str,  | The start date of the instrument. Only applicable for instruments of type &#x60;bond&#x60; or &#x60;savings&#x60;. | value must conform to RFC-3339 full-date YYYY-MM-DD
**[fees](#fees)** | list, tuple, None,  | tuple, NoneClass,  | An array of fees that apply to the instrument. | 
**[interest_rates](#interest_rates)** | list, tuple, None,  | tuple, NoneClass,  | An array of interest rates that apply to the instrument. | 
**quantity** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The total amount of shares owned in the instrument. | value must be a 32 bit float
**type** | [**EnumInvestmentPortfolioInstrumentType**](EnumInvestmentPortfolioInstrumentType.md) | [**EnumInvestmentPortfolioInstrumentType**](EnumInvestmentPortfolioInstrumentType.md) |  | 
**[public_id](#public_id)** | list, tuple, None,  | tuple, NoneClass,  | The public identifiers for the instrument. | 
**[redemption_conditions](#redemption_conditions)** | list, tuple, None,  | tuple, NoneClass,  | An array of conditions that apply to the instrument in order to retrieve the final value.  For example, the due date, the liquidity date, the previdencia type, and so on.  | 
**balance_net** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The total net value of the instrument (excluding taxes). | value must be a 32 bit float
**subtype** | None, str,  | NoneClass, str,  | The subtype for the instrument, as given by the institution. | 
**price** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The current price of one share in the instrument. | value must be a 32 bit float
**balance_gross** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The total gross value of the instrument (including taxes). | value must be a 32 bit float
**name** | str,  | str,  | The name of the instrument, as given by the institution. | 
**currency** | str,  | str,  | The currency of the instrument. For example:  - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso) - 🇺🇸 USD (US Dollar)   Please note that other currencies other than in the list above may be returned.  | 
**profit** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The current profit earned in the instrument. | value must be a 32 bit float
**average_acquisition_price** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The average price of each share acquired in the instrument. | value must be a 32 bit float
**id** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID for the current instrument. | [optional] value must be a uuid
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# public_id

The public identifiers for the instrument.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple, None,  | tuple, NoneClass,  | The public identifiers for the instrument. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**InvestmentsPortfolioInstrumentPublicId**](InvestmentsPortfolioInstrumentPublicId.md) | [**InvestmentsPortfolioInstrumentPublicId**](InvestmentsPortfolioInstrumentPublicId.md) | [**InvestmentsPortfolioInstrumentPublicId**](InvestmentsPortfolioInstrumentPublicId.md) |  | 

# redemption_conditions

An array of conditions that apply to the instrument in order to retrieve the final value.  For example, the due date, the liquidity date, the previdencia type, and so on. 

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple, None,  | tuple, NoneClass,  | An array of conditions that apply to the instrument in order to retrieve the final value.  For example, the due date, the liquidity date, the previdencia type, and so on.  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**InvestmentsPortfolioInstrumentRedemptionConditions**](InvestmentsPortfolioInstrumentRedemptionConditions.md) | [**InvestmentsPortfolioInstrumentRedemptionConditions**](InvestmentsPortfolioInstrumentRedemptionConditions.md) | [**InvestmentsPortfolioInstrumentRedemptionConditions**](InvestmentsPortfolioInstrumentRedemptionConditions.md) |  | 

# fees

An array of fees that apply to the instrument.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple, None,  | tuple, NoneClass,  | An array of fees that apply to the instrument. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**InvestmentsPortfolioInstrumentFees**](InvestmentsPortfolioInstrumentFees.md) | [**InvestmentsPortfolioInstrumentFees**](InvestmentsPortfolioInstrumentFees.md) | [**InvestmentsPortfolioInstrumentFees**](InvestmentsPortfolioInstrumentFees.md) |  | 

# interest_rates

An array of interest rates that apply to the instrument.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple, None,  | tuple, NoneClass,  | An array of interest rates that apply to the instrument. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**InvestmentsPortfolioInstrumentInterestRate**](InvestmentsPortfolioInstrumentInterestRate.md) | [**InvestmentsPortfolioInstrumentInterestRate**](InvestmentsPortfolioInstrumentInterestRate.md) | [**InvestmentsPortfolioInstrumentInterestRate**](InvestmentsPortfolioInstrumentInterestRate.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

