import io.reactivex.rxjava3.core.Observable

fun main(args: Array<String>) {
    Observable.create<String> {
        println("working")
        it.onError(Exception(""))
    }.retry(1).subscribe({
        println("success")
    }, {
        println("error")
    })
}