/*
Java test for card class
Goals: make sure the card class can compare the input suit and number with the existing number

 */

    @Test
    public void testGetIndex() {

        Response response = makeRequest(
                Request.GET().url(
                        testServerUrl().path(URL_INDEX)));

        assertThat(response.payload, containsString("Hello World!"));
        assertThat(response.payload, containsString("BAM!"));
    }

@test
   public void testcompare_card(int number,string suit){


        }
