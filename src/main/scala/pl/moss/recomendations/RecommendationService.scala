package pl.moss.recomendations

trait Recommendation {

  def itemId: String

  def score: Double

}

trait RecommendationService {

  def forUserId(userId: String, limit: Int): Seq[Recommendation]

  def forProductId(productId: String, limit: Int): Seq[Recommendation]

}
