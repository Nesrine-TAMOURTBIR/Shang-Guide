package com.example.projet_dam;


import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;


public class TouristPlacesActivity extends AppCompatActivity {
    private ArrayList<Place> placesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourist_places);

        placesList = new ArrayList<>();

        // Oriental Pearl Tower - 3 images
        ArrayList<Integer> orientalPearlImages = new ArrayList<>();
        orientalPearlImages.add(R.drawable.oriental_pearl1);
        orientalPearlImages.add(R.drawable.oriental_pearl2);
        orientalPearlImages.add(R.drawable.oriental_pearl3);

        // The Bund - 3 images
        ArrayList<Integer> theBundImages = new ArrayList<>();
        theBundImages.add(R.drawable.the_bund1);
        theBundImages.add(R.drawable.the_bund2);
        theBundImages.add(R.drawable.the_bund3);

        // shanghai museum - 3 images
        ArrayList<Integer> shanghaiMuseumImages = new ArrayList<>();
        shanghaiMuseumImages.add(R.drawable.shanghai_museum1);
        shanghaiMuseumImages.add(R.drawable.shanghai_museum2);
        shanghaiMuseumImages.add(R.drawable.shanghai_museum3);

        // shanghai museum - 4 images
        ArrayList<Integer> zhujiajiaoWaterTownImages = new ArrayList<>();
        zhujiajiaoWaterTownImages.add(R.drawable.zhujiajiao_water_town1);
        zhujiajiaoWaterTownImages.add(R.drawable.zhujiajiao_water_town2);
        zhujiajiaoWaterTownImages.add(R.drawable.zhujiajiao_water_town3);
        zhujiajiaoWaterTownImages.add(R.drawable.zhujiajiao_water_town4);

        // jingan Temple - 3 images
        ArrayList<Integer> jinganTempleImages = new ArrayList<>();
        jinganTempleImages.add(R.drawable.jingan_temple1);
        jinganTempleImages.add(R.drawable.jingan_temple2);
        jinganTempleImages.add(R.drawable.jingan_temple3);

        // shanghai museum - 5 images
        ArrayList<Integer> shanghaiDisneylandImages = new ArrayList<>();
        shanghaiDisneylandImages.add(R.drawable.shanghai_disneyland1);
        shanghaiDisneylandImages.add(R.drawable.img);
        shanghaiDisneylandImages.add(R.drawable.shanghai_disneyland3);
        shanghaiDisneylandImages.add(R.drawable.shanghai_disneyland4);
        shanghaiDisneylandImages.add(R.drawable.shanghai_disneyland5);

        // tianzifang shanghai - 4 images
        ArrayList<Integer> tianzifangImages = new ArrayList<>();
        tianzifangImages.add(R.drawable.tianzifang1);
        tianzifangImages.add(R.drawable.tianzifang2);
        tianzifangImages.add(R.drawable.tianzifang3);





        // Add places to the list
        placesList.add(new Place("Oriental Pearl Tower",
                "Rising 468 meters over Shanghai, the Oriental Pearl Tower amazes visitors with its unique pearl-inspired spherical design. This architectural marvel offers:\n" +
                "\n" +
                "Breathtaking panoramic views from multiple observation decks\n" +
                "\n" +
                "A revolving restaurant with ever-changing city vistas\n" +
                "\n" +
                "An immersive history museum showcasing Shanghai's transformation\n" +
                "\n" +
                "Spectacular light shows that illuminate the night sky\n" +
                "\n" +
                "Completed in 1994, this engineering masterpiece remains one of China's most visited attractions, blending cutting-edge design with unforgettable experiences. Whether you're admiring the Huangpu River from its glass-floored deck or watching the city lights dance across its futuristic facade, the tower captures the vibrant spirit of modern Shanghai.",
                orientalPearlImages,
                "+86 21 5879 1888",
                "info@orientalpearl.com",
                "1 Century Avenue, Pudong, Shanghai",
                "  www.orientalpearltower.com"));
        /*
📍 الموقع: جادة القرن 1، بودونغ، شنغهاي
        يُعتبر برج اللؤلؤة الشرقي (468 متراً) أيقونة شنغهاي العالمية بفضل تصميمه الفريد المكون من كرات لؤلؤية الشكل. يقدم البرج لزواره:

مناظر بانورامية خلابة من منصات مشاهدة متعددة المستويات

مطعم دوار فاخر مع إطلالة متغيرة على المدينة

متحف تاريخي يروي قصة تطور شنغهاي

عروض ضوئية مبهرة عند المساء

بُني عام 1994، ولا يزال البرج يجذب الملايين سنوياً كواحد من أعظم إنجازات الهندسة الصينية وأكثر الوجهات السياحية إثارة في العالم.
        * */



        placesList.add(new Place("The Bund ",
                "Stretching along the Huangpu River, The Bund is Shanghai's most iconic historical landmark, showcasing a stunning contrast between old and new. This magnificent waterfront avenue features:\n" +
                        "\n" +
                        "Colonial-era architecture with 52 historic buildings in Gothic, Baroque, and Neoclassical styles\n" +
                        "\n" +
                        "Panoramic views of Pudong's futuristic skyline across the river\n" +
                        "\n" +
                        "Vibrant atmosphere day and night, perfect for leisurely strolls\n" +
                        "\n" +
                        "Rich history as the financial center of 1920s Shanghai\n" +
                        "\n" +
                        "By day, admire the architectural details of former banks and trading houses. At night, witness the spectacular light show as Pudong's skyscrapers illuminate the river. The Bund perfectly encapsulates Shanghai's journey from treaty port to global metropolis.",
                shanghaiMuseumImages,
                "+86 21 6321 5757",
                " info@shanghaitour.com",
                "Zhongshan East 1st Road, Huangpu District, Shanghai",
                " www.shanghaitour.com/thebund"));
        /*
        📍 الموقع: طريق تشونغشان الشرقي، منطقة هوانغبو، شنغهاي
        يمتد الرصيف الشهير على ضفاف نهر هوانغبو، ليكون أشهر معلم تاريخي في شنغهاي يجسد التناقض الجميل بين الماضي والحاضر. هذه الواجهة المائية الرائعة تقدم:

تحف معمارية من الحقبة الاستعمارية تضم 52 مبنى تاريخياً

مناظر خلابة لخط أفق بودونغ الحديث عبر النهر

أجواء حيوية نهاراً وليلاً للمشي والاستمتاع

إرث تاريخي عريق كمركز مالي عالمي في عشرينيات القرن الماضي

في النهار، يمكنك استكشاف التفاصيل المعمارية الفخمة للبنوك والمباني التجارية القديمة. أما في المساء، فتشهد عرضاً ضوئياً ساحراً مع إضاءة ناطحات السحاب الحديثة. يجسد الرصيف روح شنغهاي من ميناء تجاري إلى مدينة عالمية بامتياز.*/


        placesList.add(new Place("Shanghai Museum",
                "As one of China's finest museums, the Shanghai Museum houses a world-class collection of ancient Chinese art and artifacts. Key highlights include:\n" +
                        "\n" +
                        "• 120,000+ artifacts across 11 galleries showcasing 5,000 years of Chinese history\n" +
                        "\n" +
                        "• Renowned collections of ancient bronzes, ceramics, calligraphy, and jade\n" +
                        "\n" +
                        "• The iconic round dome and square base design symbolizing ancient Chinese cosmology\n" +
                        "\n" +
                        "• Free admission with excellent English explanations and audio guides\n" +
                        "\n" +
                        "Spend hours admiring treasures like the 2,000-year-old bronze mirrors or delicate Ming Dynasty porcelain. The museum's modern exhibition spaces make ancient art accessible through interactive displays and thematic organization from prehistoric times to the Qing Dynasty.",
                shanghaiMuseumImages,
                "+86 21 6372 3500",
                "info@shanghaimuseum.net",
                "201 Renmin Avenue, Huangpu District, Shanghai",
                "www.shanghaimuseum.net"));

        /**
         الموقع:
         "201 جادة الشعب (رنمين)، منطقة هوانغبو، شنغهاي، الصين"

         "يُعتبر متحف شنغهاي تحفة معمارية وصرحاً ثقافياً يختزل 5000 عام من التاريخ الصيني العريق. هذا المتحف العالمي يقدم لزواره:

         • 11 قاعة عرض تضم أكثر من 120 ألف قطعة أثرية نادرة
         • أقسام متخصصة للبرونزيات القديمة، الخزف الصيني، الأعمال الفنية اليشمية
         • مجموعة فريدة من الخطوط الصينية واللوحات الزيتية
         • تصميم معماري فريد يجمع بين الحداثة والتراث الصيني

         يأخذك المتحف في رحلة عبر العصور من خلال عرض ممنهج ومبهر، مع شرح وافٍ باللغات الأجنبية."



         *
         */


        placesList.add(new Place("Zhujiajiao Water Town",
                "Dubbed the 'Venice of Shanghai', this 1,700-year-old ancient water town charms visitors with:\n\n" +
                        "• A network of canals crossed by 36 stone bridges, including the iconic 5-arch Fangsheng Bridge\n" +
                        "• Well-preserved Ming and Qing dynasty architecture along the waterways\n" +
                        "• Traditional wooden gondolas (called 'wupeng') for romantic canal rides\n" +
                        "• Authentic street food like bamboo-wrapped pork and sweet rice cakes\n" +
                        "• Historic sites like Baozhu Temple (built 1580)\n\n" +
                        "Morning mist over the canals and red lanterns at dusk create picture-perfect moments. "
                        + "The slower pace here offers a peaceful escape from Shanghai's urban bustle.",
                shanghaiDisneylandImages,
                "+86 21 5924 0088",
                "zhujiajiaoWaterTown@gmail.com",
                "Qingpu District, Shanghai (50km from city center)",
                "zhujiajiaoWaterTown.com"));

        /*
        *
        📍 الموقع: منطقة تشينغبو، شنغهاي، الصين (على بعد 50 كم من وسط المدينة)
        الوصف:
تُعرف تشوجياجياو بأنها "فينيسيا الشرق"، وهي بلدة مائية ساحرة يعود تاريخها إلى 1700 عام! تتميز بـ:

شبكة قنوات مائية متشعبة تعبر تحت 36 جسراً حجرياً قديماً، أشهرها جسر فانغشينغ ذو القوس الخماسي.

منازل تقليدية من عهد أسرتي مينغ وتشينغ، محفوظة بطابعها الأصلي.

زوارق خشبية (تسمى "أطواش") لنزهات رومانسية بين القنوات.

أسواق محلية تبيع المأكولات الشعبية مثل "اللحم المطهو بأوراق الخيزران" والحلويات التقليدية.

معابد قديمة مثل معبد باوتزوهي البوذي.
        *
        *
        * */


        placesList.add(new Place("Jing'an Temple",
                "A stunning golden oasis amidst Shanghai's skyscrapers, this 780-year-old Buddhist temple features:\n\n" +
                        "• The magnificent 8.8-ton pure silver Buddha statue in the Mahavira Hall\n" +
                        "• Three golden main halls with exquisite Song Dynasty architecture\n" +
                        "• The peaceful 'Jade Buddha Chamber' with rare white jade statues\n" +
                        "• Underground palace with ancient relics beneath the temple\n" +
                        "• Daily chanting ceremonies (6:00 AM & 3:00 PM)\n\n" +
                        "The temple's golden roofs glow against modern towers like the Jing'an Kerry Centre. "
                        + "Burn incense at the giant bronze furnace and experience spiritual calm in the city's heart.",
                jinganTempleImages,
                "+86 21 6256 3666",
                "info@jingantemple.com",
                "1686 West Nanjing Road, Jing'an District",
                "www.jingantemple.com"));

        /**
         *
         الموقع:
         "1686 طريق نانجينغ الغربي، منطقة جينغ آن، شنغهاي، الصين"
         "يُعتبر معبد جينغ آن جوهرة روحانية تلمع في قلب شنغهاي الحديثة. هذا الصرح البوذي العريق الذي يعود تاريخه إلى أكثر من 780 عاماً يجمع بين الأصالة والحداثة عبر:

         • قاعة ماهافيرا الرئيسية التي تضم تمثال بوذا الفضي الضخم (8.8 طن)
         • ثلاثة صالات ذهبية رئيسية بتصميمات معمارية تعود لعهد أسرة سونغ
         • جناح تماثيل اليشم الأبيض النادر
         • قصر أثري تحت الأرض يضم كنوزاً تاريخية
         • طقوس تراتيل يومية (6 صباحاً و3 عصراً)

         تتألق القباب الذهبية للمعبد بجوار ناطحات السحاب الحديثة، مما يخلق مشهداً ساحراً يجسد تناغم الماضي مع الحاضر."
         *
         */

        placesList.add(new Place("Shanghai Disneyland",
                "The first Disney resort in mainland China brings magic to life with:\n\n" +
                        "• 6 uniquely themed lands including the largest Disney Castle ever built\n" +
                        "• Exclusive attractions like TRON Lightcycle Power Run (world's fastest Disney coaster)\n" +
                        "• Spectacular shows: 'Tarzan: Call of the Jungle' and nighttime 'Ignite the Dream' projection show\n" +
                        "• Character meet-and-greets with Mickey in traditional Chinese costumes\n" +
                        "• Authentic Chinese cuisine at Barbossa's Bounty and other themed restaurants\n\n" ,
                shanghaiDisneylandImages,
                "+86 21 3158 0000",
                "guest.services@shanghaidisneyresort.com",
                "Chuansha New Town, Pudong District, Shanghai",
                "www.shanghaidisneyresort.com"));

        /*
        * الموقع:
"بلدة تشوانشا الجديدة، منطقة بودونغ، شنغهاي، الصين"


        الوصف:
"أول مدينة ملاهي ديزني في البر الصيني الرئيسي، تُعد عالمًا ساحرًا يجمع بين الأصالة الديزنية واللمسات الصينية الفريدة. تتميز بـ:

• 6 مناطق موضوعية تشمل أكبر قلعة ديزني في العالم (قلعة سنو وايت الساحرة)
• ألعاب حصرية مثل سباق الدرجات الضوئية في لعبة «ترون» (أسرع أفعوانية في عالم ديزني)
• عروض مبهرة: مسرحية «طرزان» وعرض الأضواء الليلي «أضواء الأحلام»
• لقاءات مع شخصيات ديزني مثل ميكي ماوس مرتديًا الأزياء الصينية التقليدية
• مطاعم مميزة تقدم مأكولات عالمية مع نكهات صينية

        *
        * */

        placesList.add(new Place("Tianzifang",
                "A bohemian labyrinth where old Shanghai meets creative modernity:\n\n" +
                        "• Converted 1930s shikumen (stone-gate) factories and lane houses\n" +
                        "• 200+ independent artist studios, craft shops, and design boutiques\n" +
                        "• Hidden cafes in airwell courtyards and rooftop terraces\n" +
                        "• Authentic local eateries serving shengjianbao (pan-fried buns)\n" +
                        "• Weekly art exhibitions and live music events\n\n" +
                        "Wander through narrow alleys draped with laundry and paper lanterns - "
                        + "every corner reveals Instagram-worthy vignettes of artistic Shanghai.",
                tianzifangImages,
                "", // No central phone
                "",
                "No. 210 Taikang Road, Huangpu District",
                ""));

        /*
        *
        الوصف:
تيانزي فانغ هي متاهة فنية ساحرة تدمج بين الأصالة والحداثة في شنغهاي، وتتميز بما يلي:

• مباني تاريخية من طراز شيكومن (باب حجري) تعود لعام 1930
• أكثر من 200 ستوديو فني ومحل حرف يدوية فريدة
• مقاهي مخفية في ساحات داخلية وحدائق علوية
• مطاعم محلية تقدم أكلات تقليدية مثل شينغجيانباو (الزلابية المقلية)
• معارض فنية أسبوعية وحفلات موسيقية حية

نصيحة للزوار: تجولوا في الأزقة الضيقة المزينة بالفوانيس الورقية حيث كل ركن يخفي لقطة فنية تصلح للإنستغرام!

الموقع:
رقم 210 طريق تايكانغ، منطقة هوانغبو، شنغهاي، الصين


        * */

        // Display the places in a ListView
        ArrayList<String> placeNames = new ArrayList<>();
        for (Place place : placesList) {
            placeNames.add(place.getName());
        }

        ListView listView = findViewById(R.id.listViewTouristPlaces);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, placeNames);
        listView.setAdapter(adapter);

        // Handle clicks on list items
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Place selectedPlace = placesList.get(position);

            if (selectedPlace == null) {
                System.out.println("Error: selectedPlace is null!");
                return;
            }

            Intent intent = new Intent(TouristPlacesActivity.this, DescriptionActivity.class);
            intent.putExtra("name", selectedPlace.getName());
            intent.putExtra("description", selectedPlace.getDescription());

            // تأكد أن الصور ليست null
            if (selectedPlace.getImageResourceIds() != null) {
                intent.putIntegerArrayListExtra("images", selectedPlace.getImageResourceIds());
            }

            intent.putExtra("phone", selectedPlace.getPhone());
            intent.putExtra("email", selectedPlace.getEmail());

            startActivity(intent);
        });

    }
}
