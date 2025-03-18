import retrofit2.Call
import retrofit2.http.GET
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface SupabaseService {
    @GET("rest/v1/instruments")
    fun getInstruments(): Call<List<Instrument>>

    companion object {
        fun create(): SupabaseService {
            val retrofit = Retrofit.Builder()
                .baseUrl("https://aojhlozkjnpiskigzbzc.supabase.co")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(SupabaseService::class.java)
        }
    }
}