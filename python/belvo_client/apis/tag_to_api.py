import typing_extensions

from belvo_client.apis.tags import TagValues
from belvo_client.apis.tags.links_api import LinksApi
from belvo_client.apis.tags.accounts_api import AccountsApi
from belvo_client.apis.tags.transactions_api import TransactionsApi
from belvo_client.apis.tags.balances_api import BalancesApi
from belvo_client.apis.tags.owners_api import OwnersApi
from belvo_client.apis.tags.investment_portfolios_api import InvestmentPortfoliosApi
from belvo_client.apis.tags.incomes_api import IncomesApi
from belvo_client.apis.tags.recurring_expenses_api import RecurringExpensesApi
from belvo_client.apis.tags.risk_insights_api import RiskInsightsApi
from belvo_client.apis.tags.invoices_api import InvoicesApi
from belvo_client.apis.tags.receivable_transactions_api import ReceivableTransactionsApi
from belvo_client.apis.tags.employment_records_api import EmploymentRecordsApi
from belvo_client.apis.tags.tax_declarations_api import TaxDeclarationsApi
from belvo_client.apis.tags.tax_returns_api import TaxReturnsApi
from belvo_client.apis.tags.tax_status_api import TaxStatusApi
from belvo_client.apis.tags.tax_retentions_api import TaxRetentionsApi
from belvo_client.apis.tags.tax_compliance_status_api import TaxComplianceStatusApi
from belvo_client.apis.tags.payment_intents_api import PaymentIntentsApi
from belvo_client.apis.tags.customers_api import CustomersApi
from belvo_client.apis.tags.bank_accounts_api import BankAccountsApi
from belvo_client.apis.tags.payment_links_api import PaymentLinksApi
from belvo_client.apis.tags.institutions_api import InstitutionsApi
from belvo_client.apis.tags.secret_keys_api import SecretKeysApi
from belvo_client.apis.tags.payment_institutions_api import PaymentInstitutionsApi
from belvo_client.apis.tags.payment_transactions_api import PaymentTransactionsApi
from belvo_client.apis.tags.categorization_api import CategorizationApi
from belvo_client.apis.tags.income_verification_api import IncomeVerificationApi
from belvo_client.apis.tags.banking_api_introduction_api import BankingAPIIntroductionApi
from belvo_client.apis.tags.enrichment_api_introduction_api import EnrichmentAPIIntroductionApi
from belvo_client.apis.tags.eyodapi_introduction_api import EYODAPIIntroductionApi
from belvo_client.apis.tags.fiscal_api_introduction_api import FiscalAPIIntroductionApi
from belvo_client.apis.tags.payment_initiation_introduction_api import PaymentInitiationIntroductionApi

TagToApi = typing_extensions.TypedDict(
    'TagToApi',
    {
        TagValues.LINKS: LinksApi,
        TagValues.ACCOUNTS: AccountsApi,
        TagValues.TRANSACTIONS: TransactionsApi,
        TagValues.BALANCES: BalancesApi,
        TagValues.OWNERS: OwnersApi,
        TagValues.INVESTMENT_PORTFOLIOS: InvestmentPortfoliosApi,
        TagValues.INCOMES: IncomesApi,
        TagValues.RECURRING_EXPENSES: RecurringExpensesApi,
        TagValues.RISK_INSIGHTS: RiskInsightsApi,
        TagValues.INVOICES: InvoicesApi,
        TagValues.RECEIVABLE_TRANSACTIONS: ReceivableTransactionsApi,
        TagValues.EMPLOYMENT_RECORDS: EmploymentRecordsApi,
        TagValues.TAX_DECLARATIONS: TaxDeclarationsApi,
        TagValues.TAX_RETURNS: TaxReturnsApi,
        TagValues.TAX_STATUS: TaxStatusApi,
        TagValues.TAX_RETENTIONS: TaxRetentionsApi,
        TagValues.TAX_COMPLIANCE_STATUS: TaxComplianceStatusApi,
        TagValues.PAYMENT_INTENTS: PaymentIntentsApi,
        TagValues.CUSTOMERS: CustomersApi,
        TagValues.BANK_ACCOUNTS: BankAccountsApi,
        TagValues.PAYMENT_LINKS: PaymentLinksApi,
        TagValues.INSTITUTIONS: InstitutionsApi,
        TagValues.SECRET_KEYS: SecretKeysApi,
        TagValues.PAYMENT_INSTITUTIONS: PaymentInstitutionsApi,
        TagValues.PAYMENT_TRANSACTIONS: PaymentTransactionsApi,
        TagValues.CATEGORIZATION: CategorizationApi,
        TagValues.INCOME_VERIFICATION: IncomeVerificationApi,
        TagValues.BANKING_API_INTRODUCTION: BankingAPIIntroductionApi,
        TagValues.ENRICHMENT_API_INTRODUCTION: EnrichmentAPIIntroductionApi,
        TagValues.EYOD_API_INTRODUCTION: EYODAPIIntroductionApi,
        TagValues.FISCAL_API_INTRODUCTION: FiscalAPIIntroductionApi,
        TagValues.PAYMENT_INITIATION_INTRODUCTION: PaymentInitiationIntroductionApi,
    }
)

tag_to_api = TagToApi(
    {
        TagValues.LINKS: LinksApi,
        TagValues.ACCOUNTS: AccountsApi,
        TagValues.TRANSACTIONS: TransactionsApi,
        TagValues.BALANCES: BalancesApi,
        TagValues.OWNERS: OwnersApi,
        TagValues.INVESTMENT_PORTFOLIOS: InvestmentPortfoliosApi,
        TagValues.INCOMES: IncomesApi,
        TagValues.RECURRING_EXPENSES: RecurringExpensesApi,
        TagValues.RISK_INSIGHTS: RiskInsightsApi,
        TagValues.INVOICES: InvoicesApi,
        TagValues.RECEIVABLE_TRANSACTIONS: ReceivableTransactionsApi,
        TagValues.EMPLOYMENT_RECORDS: EmploymentRecordsApi,
        TagValues.TAX_DECLARATIONS: TaxDeclarationsApi,
        TagValues.TAX_RETURNS: TaxReturnsApi,
        TagValues.TAX_STATUS: TaxStatusApi,
        TagValues.TAX_RETENTIONS: TaxRetentionsApi,
        TagValues.TAX_COMPLIANCE_STATUS: TaxComplianceStatusApi,
        TagValues.PAYMENT_INTENTS: PaymentIntentsApi,
        TagValues.CUSTOMERS: CustomersApi,
        TagValues.BANK_ACCOUNTS: BankAccountsApi,
        TagValues.PAYMENT_LINKS: PaymentLinksApi,
        TagValues.INSTITUTIONS: InstitutionsApi,
        TagValues.SECRET_KEYS: SecretKeysApi,
        TagValues.PAYMENT_INSTITUTIONS: PaymentInstitutionsApi,
        TagValues.PAYMENT_TRANSACTIONS: PaymentTransactionsApi,
        TagValues.CATEGORIZATION: CategorizationApi,
        TagValues.INCOME_VERIFICATION: IncomeVerificationApi,
        TagValues.BANKING_API_INTRODUCTION: BankingAPIIntroductionApi,
        TagValues.ENRICHMENT_API_INTRODUCTION: EnrichmentAPIIntroductionApi,
        TagValues.EYOD_API_INTRODUCTION: EYODAPIIntroductionApi,
        TagValues.FISCAL_API_INTRODUCTION: FiscalAPIIntroductionApi,
        TagValues.PAYMENT_INITIATION_INTRODUCTION: PaymentInitiationIntroductionApi,
    }
)
