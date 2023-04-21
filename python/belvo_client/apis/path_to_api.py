import typing_extensions

from belvo_client.paths import PathValues
from belvo_client.apis.paths.api_links import ApiLinks
from belvo_client.apis.paths.api_links_id import ApiLinksId
from belvo_client.apis.paths.api_accounts import ApiAccounts
from belvo_client.apis.paths.api_accounts_id import ApiAccountsId
from belvo_client.apis.paths.api_transactions import ApiTransactions
from belvo_client.apis.paths.api_transactions_id import ApiTransactionsId
from belvo_client.apis.paths.api_balances import ApiBalances
from belvo_client.apis.paths.api_balances_id import ApiBalancesId
from belvo_client.apis.paths.api_institutions import ApiInstitutions
from belvo_client.apis.paths.api_institutions_id import ApiInstitutionsId
from belvo_client.apis.paths.api_owners import ApiOwners
from belvo_client.apis.paths.api_owners_id import ApiOwnersId
from belvo_client.apis.paths.api_invoices import ApiInvoices
from belvo_client.apis.paths.api_invoices_id import ApiInvoicesId
from belvo_client.apis.paths.api_tax_returns import ApiTaxReturns
from belvo_client.apis.paths.api_tax_returns_id import ApiTaxReturnsId
from belvo_client.apis.paths.api_tax_status import ApiTaxStatus
from belvo_client.apis.paths.api_tax_status_id import ApiTaxStatusId
from belvo_client.apis.paths.api_tax_compliance_status import ApiTaxComplianceStatus
from belvo_client.apis.paths.api_tax_compliance_status_id import ApiTaxComplianceStatusId
from belvo_client.apis.paths.api_incomes import ApiIncomes
from belvo_client.apis.paths.api_incomes_id import ApiIncomesId
from belvo_client.apis.paths.api_recurring_expenses import ApiRecurringExpenses
from belvo_client.apis.paths.api_recurring_expenses_id import ApiRecurringExpensesId
from belvo_client.apis.paths.investments_portfolios import InvestmentsPortfolios
from belvo_client.apis.paths.investments_portfolios_id import InvestmentsPortfoliosId
from belvo_client.apis.paths.receivables_transactions import ReceivablesTransactions
from belvo_client.apis.paths.receivables_transactions_id import ReceivablesTransactionsId
from belvo_client.apis.paths.api_risk_insights import ApiRiskInsights
from belvo_client.apis.paths.api_risk_insights_id import ApiRiskInsightsId
from belvo_client.apis.paths.api_tax_retentions import ApiTaxRetentions
from belvo_client.apis.paths.api_tax_retentions_id import ApiTaxRetentionsId
from belvo_client.apis.paths.api_tax_declarations import ApiTaxDeclarations
from belvo_client.apis.paths.api_tax_declarations_id import ApiTaxDeclarationsId
from belvo_client.apis.paths.api_employment_records import ApiEmploymentRecords
from belvo_client.apis.paths.api_employment_records_id import ApiEmploymentRecordsId
from belvo_client.apis.paths.api_enrich_incomes import ApiEnrichIncomes
from belvo_client.apis.paths.api_categorization import ApiCategorization
from belvo_client.apis.paths.payments_secret_keys import PaymentsSecretKeys
from belvo_client.apis.paths.payments_institutions import PaymentsInstitutions
from belvo_client.apis.paths.payments_institutions_id import PaymentsInstitutionsId
from belvo_client.apis.paths.payments_customers import PaymentsCustomers
from belvo_client.apis.paths.payments_customers_id import PaymentsCustomersId
from belvo_client.apis.paths.payments_bank_accounts import PaymentsBankAccounts
from belvo_client.apis.paths.payments_bank_accounts_id import PaymentsBankAccountsId
from belvo_client.apis.paths.payments_payment_links import PaymentsPaymentLinks
from belvo_client.apis.paths.payments_payment_links_access_token import PaymentsPaymentLinksAccessToken
from belvo_client.apis.paths.payments_payment_intents import PaymentsPaymentIntents
from belvo_client.apis.paths.payments_payment_intents_id import PaymentsPaymentIntentsId
from belvo_client.apis.paths.payments_transactions import PaymentsTransactions
from belvo_client.apis.paths.payments_transactions_id import PaymentsTransactionsId

PathToApi = typing_extensions.TypedDict(
    'PathToApi',
    {
        PathValues._API_LINKS: ApiLinks,
        PathValues._API_LINKS_ID: ApiLinksId,
        PathValues._API_ACCOUNTS: ApiAccounts,
        PathValues._API_ACCOUNTS_ID: ApiAccountsId,
        PathValues._API_TRANSACTIONS: ApiTransactions,
        PathValues._API_TRANSACTIONS_ID: ApiTransactionsId,
        PathValues._API_BALANCES: ApiBalances,
        PathValues._API_BALANCES_ID: ApiBalancesId,
        PathValues._API_INSTITUTIONS: ApiInstitutions,
        PathValues._API_INSTITUTIONS_ID: ApiInstitutionsId,
        PathValues._API_OWNERS: ApiOwners,
        PathValues._API_OWNERS_ID: ApiOwnersId,
        PathValues._API_INVOICES: ApiInvoices,
        PathValues._API_INVOICES_ID: ApiInvoicesId,
        PathValues._API_TAXRETURNS: ApiTaxReturns,
        PathValues._API_TAXRETURNS_ID: ApiTaxReturnsId,
        PathValues._API_TAXSTATUS: ApiTaxStatus,
        PathValues._API_TAXSTATUS_ID: ApiTaxStatusId,
        PathValues._API_TAXCOMPLIANCESTATUS: ApiTaxComplianceStatus,
        PathValues._API_TAXCOMPLIANCESTATUS_ID: ApiTaxComplianceStatusId,
        PathValues._API_INCOMES: ApiIncomes,
        PathValues._API_INCOMES_ID: ApiIncomesId,
        PathValues._API_RECURRINGEXPENSES: ApiRecurringExpenses,
        PathValues._API_RECURRINGEXPENSES_ID: ApiRecurringExpensesId,
        PathValues._INVESTMENTS_PORTFOLIOS: InvestmentsPortfolios,
        PathValues._INVESTMENTS_PORTFOLIOS_ID: InvestmentsPortfoliosId,
        PathValues._RECEIVABLES_TRANSACTIONS: ReceivablesTransactions,
        PathValues._RECEIVABLES_TRANSACTIONS_ID: ReceivablesTransactionsId,
        PathValues._API_RISKINSIGHTS: ApiRiskInsights,
        PathValues._API_RISKINSIGHTS_ID: ApiRiskInsightsId,
        PathValues._API_TAXRETENTIONS: ApiTaxRetentions,
        PathValues._API_TAXRETENTIONS_ID: ApiTaxRetentionsId,
        PathValues._API_TAXDECLARATIONS: ApiTaxDeclarations,
        PathValues._API_TAXDECLARATIONS_ID: ApiTaxDeclarationsId,
        PathValues._API_EMPLOYMENTRECORDS: ApiEmploymentRecords,
        PathValues._API_EMPLOYMENTRECORDS_ID: ApiEmploymentRecordsId,
        PathValues._API_ENRICH_INCOMES: ApiEnrichIncomes,
        PathValues._API_CATEGORIZATION: ApiCategorization,
        PathValues._PAYMENTS_SECRETKEYS: PaymentsSecretKeys,
        PathValues._PAYMENTS_INSTITUTIONS: PaymentsInstitutions,
        PathValues._PAYMENTS_INSTITUTIONS_ID: PaymentsInstitutionsId,
        PathValues._PAYMENTS_CUSTOMERS: PaymentsCustomers,
        PathValues._PAYMENTS_CUSTOMERS_ID: PaymentsCustomersId,
        PathValues._PAYMENTS_BANKACCOUNTS: PaymentsBankAccounts,
        PathValues._PAYMENTS_BANKACCOUNTS_ID: PaymentsBankAccountsId,
        PathValues._PAYMENTS_PAYMENTLINKS: PaymentsPaymentLinks,
        PathValues._PAYMENTS_PAYMENTLINKS_ACCESS_TOKEN: PaymentsPaymentLinksAccessToken,
        PathValues._PAYMENTS_PAYMENTINTENTS: PaymentsPaymentIntents,
        PathValues._PAYMENTS_PAYMENTINTENTS_ID: PaymentsPaymentIntentsId,
        PathValues._PAYMENTS_TRANSACTIONS: PaymentsTransactions,
        PathValues._PAYMENTS_TRANSACTIONS_ID: PaymentsTransactionsId,
    }
)

path_to_api = PathToApi(
    {
        PathValues._API_LINKS: ApiLinks,
        PathValues._API_LINKS_ID: ApiLinksId,
        PathValues._API_ACCOUNTS: ApiAccounts,
        PathValues._API_ACCOUNTS_ID: ApiAccountsId,
        PathValues._API_TRANSACTIONS: ApiTransactions,
        PathValues._API_TRANSACTIONS_ID: ApiTransactionsId,
        PathValues._API_BALANCES: ApiBalances,
        PathValues._API_BALANCES_ID: ApiBalancesId,
        PathValues._API_INSTITUTIONS: ApiInstitutions,
        PathValues._API_INSTITUTIONS_ID: ApiInstitutionsId,
        PathValues._API_OWNERS: ApiOwners,
        PathValues._API_OWNERS_ID: ApiOwnersId,
        PathValues._API_INVOICES: ApiInvoices,
        PathValues._API_INVOICES_ID: ApiInvoicesId,
        PathValues._API_TAXRETURNS: ApiTaxReturns,
        PathValues._API_TAXRETURNS_ID: ApiTaxReturnsId,
        PathValues._API_TAXSTATUS: ApiTaxStatus,
        PathValues._API_TAXSTATUS_ID: ApiTaxStatusId,
        PathValues._API_TAXCOMPLIANCESTATUS: ApiTaxComplianceStatus,
        PathValues._API_TAXCOMPLIANCESTATUS_ID: ApiTaxComplianceStatusId,
        PathValues._API_INCOMES: ApiIncomes,
        PathValues._API_INCOMES_ID: ApiIncomesId,
        PathValues._API_RECURRINGEXPENSES: ApiRecurringExpenses,
        PathValues._API_RECURRINGEXPENSES_ID: ApiRecurringExpensesId,
        PathValues._INVESTMENTS_PORTFOLIOS: InvestmentsPortfolios,
        PathValues._INVESTMENTS_PORTFOLIOS_ID: InvestmentsPortfoliosId,
        PathValues._RECEIVABLES_TRANSACTIONS: ReceivablesTransactions,
        PathValues._RECEIVABLES_TRANSACTIONS_ID: ReceivablesTransactionsId,
        PathValues._API_RISKINSIGHTS: ApiRiskInsights,
        PathValues._API_RISKINSIGHTS_ID: ApiRiskInsightsId,
        PathValues._API_TAXRETENTIONS: ApiTaxRetentions,
        PathValues._API_TAXRETENTIONS_ID: ApiTaxRetentionsId,
        PathValues._API_TAXDECLARATIONS: ApiTaxDeclarations,
        PathValues._API_TAXDECLARATIONS_ID: ApiTaxDeclarationsId,
        PathValues._API_EMPLOYMENTRECORDS: ApiEmploymentRecords,
        PathValues._API_EMPLOYMENTRECORDS_ID: ApiEmploymentRecordsId,
        PathValues._API_ENRICH_INCOMES: ApiEnrichIncomes,
        PathValues._API_CATEGORIZATION: ApiCategorization,
        PathValues._PAYMENTS_SECRETKEYS: PaymentsSecretKeys,
        PathValues._PAYMENTS_INSTITUTIONS: PaymentsInstitutions,
        PathValues._PAYMENTS_INSTITUTIONS_ID: PaymentsInstitutionsId,
        PathValues._PAYMENTS_CUSTOMERS: PaymentsCustomers,
        PathValues._PAYMENTS_CUSTOMERS_ID: PaymentsCustomersId,
        PathValues._PAYMENTS_BANKACCOUNTS: PaymentsBankAccounts,
        PathValues._PAYMENTS_BANKACCOUNTS_ID: PaymentsBankAccountsId,
        PathValues._PAYMENTS_PAYMENTLINKS: PaymentsPaymentLinks,
        PathValues._PAYMENTS_PAYMENTLINKS_ACCESS_TOKEN: PaymentsPaymentLinksAccessToken,
        PathValues._PAYMENTS_PAYMENTINTENTS: PaymentsPaymentIntents,
        PathValues._PAYMENTS_PAYMENTINTENTS_ID: PaymentsPaymentIntentsId,
        PathValues._PAYMENTS_TRANSACTIONS: PaymentsTransactions,
        PathValues._PAYMENTS_TRANSACTIONS_ID: PaymentsTransactionsId,
    }
)
