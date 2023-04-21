# belvo_client.model.investments_portfolio.InvestmentsPortfolio

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**balance_net** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The total current value of the entire portfolio and all its underlying instruments, as given by the institution.  ℹ️ **Note:** In Brazil, this is usually calculated based on the net value (that is, not including tax).  | value must be a 32 bit float
**balance_gross** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The current gross total value of the entire portfolio and all its underlying instruments, as given by the institution.  | value must be a 32 bit float
**name** | str,  | str,  | The name of the portfolio, as given in the institution.  | 
**currency** | str,  | str,  | The currency of the portfolio. For example:   - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)   Please note that other currencies other than in the list above may be returned.  | 
**type** | [**EnumInvestmentPortfolioType**](EnumInvestmentPortfolioType.md) | [**EnumInvestmentPortfolioType**](EnumInvestmentPortfolioType.md) |  | 
**id** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID for the current portfolio. | [optional] value must be a uuid
**balance_type** | None, str,  | NoneClass, str,  | Indicates whether this account is either an &#x60;ASSET&#x60; or a &#x60;LIABILITY&#x60;. You can consider the balance of an &#x60;ASSET&#x60; as being positive, while the balance of a &#x60;LIABILITY&#x60; as negative.  | [optional] 
**[instruments](#instruments)** | list, tuple, None,  | tuple, NoneClass,  | An array of instruments that fall into the investment portfolio. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# instruments

An array of instruments that fall into the investment portfolio.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple, None,  | tuple, NoneClass,  | An array of instruments that fall into the investment portfolio. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**InvestmentsPortfolioInstrument**](InvestmentsPortfolioInstrument.md) | [**InvestmentsPortfolioInstrument**](InvestmentsPortfolioInstrument.md) | [**InvestmentsPortfolioInstrument**](InvestmentsPortfolioInstrument.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

