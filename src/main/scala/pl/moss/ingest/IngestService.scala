package pl.moss.ingest

trait ItemPurchasedEvent {

  def itemId: String

  def userId: String

}

trait IngestService {

  def push(event: ItemPurchasedEvent)

}
