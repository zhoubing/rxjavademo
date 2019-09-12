import io.reactivex.rxjava3.core.Observable

fun main(args: Array<String>) {
    Observable.create<String> {
        println("working")
        it.onError(Exception("101002"))
    }.retry(2) { t: Throwable? ->  t?.message == "101002"
    }.subscribe({
        println("success")
    }, {
        println("error")
    })
}