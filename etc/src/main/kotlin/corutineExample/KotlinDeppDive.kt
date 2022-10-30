package corutineExample


/*
fun loginUser(userId: String, password: String, completion: Continuation<Any?>) {
    // Label 0 -> 첫 실행시 userRemoteDataSource에 의해 실행
    val user = userRemoteDataSource.logUserIn(userId, password)
    // Label 1 -> userRemoteDataSource에 의해 재개 된다.
    val userDb = userLocalDataSource.logUserIn(user)
    // Label 2 -> userLocalDataSource에 의해 재개 된다.
    completion.resume(userDb)
}*/
