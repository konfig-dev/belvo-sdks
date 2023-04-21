from belvo_client.paths.api_recurring_expenses.get import ApiForget
from belvo_client.paths.api_recurring_expenses.post import ApiForpost
from belvo_client.paths.api_recurring_expenses.patch import ApiForpatch


class ApiRecurringExpenses(
    ApiForget,
    ApiForpost,
    ApiForpatch,
):
    pass
