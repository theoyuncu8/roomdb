

    public void getRetrofit() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(FoodAPI.FOOD_DATA_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        FoodAPI foodAPI = retrofit.create(FoodAPI.class);


        Call<MyData> call = foodAPI.getAllData();

        call.enqueue(new Callback<MyData>() {
            @Override
            public void onResponse(@NonNull Call<MyData> call, @NonNull Response<MyData> response) {
                Log.d("TAG_JSON_FOOD_DB", "--------: " + response.message());
                Log.d("TAG_JSON_FOOD_DB", "--------: " + response.body());
                List<Foods> foods=response.body().getMyData();

                for (int i=0; i<foods.size(); i++){
                    Log.d("TAG_JSON_FOOD_DB", "--------: "+"name:" +foods.get(i).getFoodName());
                    for (int k=0; k<foods.get(i).getUnits().size(); k++){
                        Log.d("TAG_JSON_FOOD_DB", "--------: " +foods.get(i).getUnits().get(k).getUnit());
                    }
                }
            }

            @Override
            public void onFailure(@NonNull Call<MyData> call, @NonNull Throwable t) {

            }
        });
    }



    class SaveTask extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void... voids) {
            Foods food = new Foods();

            // help

            FoodDatabaseClient.getInstance(getApplicationContext()).getAppDatabase()
                    .daoAccess()
                    .insert(food);
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            finish();
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            Toast.makeText(getApplicationContext(), "Saved", Toast.LENGTH_LONG).show();
        }
    }
