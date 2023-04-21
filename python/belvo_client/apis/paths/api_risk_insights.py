from belvo_client.paths.api_risk_insights.get import ApiForget
from belvo_client.paths.api_risk_insights.post import ApiForpost
from belvo_client.paths.api_risk_insights.patch import ApiForpatch


class ApiRiskInsights(
    ApiForget,
    ApiForpost,
    ApiForpatch,
):
    pass
