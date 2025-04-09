package com.example.projet_dam;



import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;


public class RestaurantsActivity extends AppCompatActivity {
    private ArrayList<Place> placesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourist_places);

        placesList = new ArrayList<>();

        // 1)  Ultraviolet by Paul Pairet - 3 images
        ArrayList<Integer> UltravioletImages = new ArrayList<>();
        UltravioletImages.add(R.drawable.ultraviolet_by_paul_pairet1);
        UltravioletImages.add(R.drawable.ultraviolet_by_paul_pairet3);
        UltravioletImages.add(R.drawable.ultraviolet_by_paul_pairet2);

        placesList.add(new Place("Ultraviolet by Paul Pairet",
                "A groundbreaking 3-Michelin-starred dining experience that redefines gastronomy through multi-sensory immersion. This exclusive restaurant offers:\n" +
                        "\n" +
                        "A 20-course avant-garde tasting menu curated by chef Paul Pairet\n" +
                        "\n" +
                        "Synchronized projections, soundscapes, and scents that evolve with each dish\n" +
                        "\n" +
                        "Only 10 seats per night in a hidden, futuristic dining pod\n" +
                        "\n" +
                        "Interactive storytelling that blends food, technology, and art\n" +
                        "\n" +
                        "Opened in 2012, Ultraviolet is a pilgrimage for food enthusiasts, combining molecular gastronomy with theatrical flair. Guests are transported to an undisclosed location where every element—from the custom-made tableware to the ambient temperature—is meticulously designed to amplify the culinary journey. This is not just a meal, but a symphony for the senses that captures Shanghai's innovative spirit.",
                UltravioletImages, // Assume this is your image array
                "+86 21 6323 9898",
                "reservations@uvbypp.cc",
                "Secret location (disclosed upon booking), Shanghai",
                "www.uvbypp.cc"));
/*
*
"أولترا فيوليت" (Ultraviolet by Paul Pairet) هو تجربة طعام فريدة من نوعها تحمل 3 نجوم ميشلان، حيث يعيد تعريف فن الطهو من خلال عرض متعدد الحواس. يقدم هذا المطعم الحصري:

قائمة تذوق متطورة من 20 طبقاً، صممها الشيف الفرنسي الشهير بول بيريه.

عروض ضوئية متزامنة ومؤثرات صوتية وروائح تتغير مع كل طبق.

10 مقاعد فقط كل ليلة داخل غرفة طعام سرية تشبه المستقبل.

قصة تفاعلية تدمج بين الطعام والتكنولوجيا والفن.

بعد افتتاحه عام 2012، أصبح "أولترا فيوليت" وجهة لعشاق الطهو حول العالم، حيث يجمع بين التقنيات الجزيئية والإخراج المسرحي. يتم نقل الضيوف إلى موقع سري (يُكشف عنه بعد الحجز)، حيث كل شيء—بدءاً من الأطباق المصممة خصيصاً وحتى درجة حرارة الغرفة—مُعد بعناية لتعزيز التجربة. هذه ليست وجبة عادية، بل سيمفونية للحواس تعكس روح شنغهاي المبتكرة."

الموقع بالعربية:
"عنوان سري (يُكشف بعد الحجز)، شنغهاي، الصين"
* */



        // 2)  Fu 1088 - 3 images
        ArrayList<Integer> fu1088Images = new ArrayList<>();
        fu1088Images.add(R.drawable.fu1088n5);
        fu1088Images.add(R.drawable.fu1088n1);
        fu1088Images.add(R.drawable.fu1088n2);
        fu1088Images.add(R.drawable.fu1088n3);
        fu1088Images.add(R.drawable.fu1088n4);


        placesList.add(new Place("Fu 1088 ",
                "A Michelin-starred sanctuary of classic Shanghainese cuisine housed in a meticulously restored 1930s villa. This elegant restaurant offers:\n\n" +
                        "Exquisitely slow-braised pork belly, a signature Shanghainese delicacy\n\n" +
                        "Drunken chicken marinated in premium Shaoxing wine\n\n" +
                        "Private dining rooms with Republican-era Shanghai charm\n\n" +
                        "Seasonal dishes preserving authentic local flavors\n\n" +
                        "Established in 2006, Fu 1088 transports diners to old Shanghai through its architecture and culinary craftsmanship. Each dish tells a story of the city's rich gastronomic heritage, served in an atmosphere of understated luxury that makes it a favorite among discerning food lovers.",


                fu1088Images, // Your image array
                "+86 21 6247 6678",
                "reservations@fu1088.com",
                "375 Zhenning Road, Changning District, Shanghai",
                "www.fu1088.com"));

        /*
                "واحة من أكل شنغهاي الكلاسيكي بنجمة ميشلان، مقرها فيلا من الثلاثينيات تم تجديدها بدقة. يقدم هذا المطعم الأنيق:\n\n" +
                        "لحم الخنزير المشوي ببطء، وهو طبق شنغهاي التقليدي المميز\n\n" +
                        "دجاج مخمور منقوع في نبيذ شاوشينغ الفاخر\n\n" +
                        "غرف طعام خاصة تعكس سحر شنغهاي في عصر الجمهورية\n\n" +
                        "أطباق موسمية تحافظ على النكهات المحلية الأصيلة\n\n" +
                        "تأسس عام 2006، ينقل فو 1088 الزوار إلى شنغهاي القديمة من خلال هندسته المعمارية وحرفية الطهي. كل طبق يحكي قصة عن التراث الغني للمدينة، مقدماً في أجواء من الفخامة البسيطة التي تجعله مفضلاً لدى عشاق الطعام الأذكياء.",
                        الموقع بالعربي:
"طريق تشينينغ رقم 375، منطقة تشانغنينغ، شنغهاي، الصين"
*/


        // 3)  Polux by Paul Pairet - 6 images
        ArrayList<Integer> poluxImages = new ArrayList<>();
        poluxImages.add(R.drawable.polux1);
        poluxImages.add(R.drawable.polux2);
        poluxImages.add(R.drawable.polux3);
        poluxImages.add(R.drawable.polux4);
        poluxImages.add(R.drawable.polux5);
        poluxImages.add(R.drawable.polux6);


        placesList.add(new Place("Polux by Paul Pairet",
                "A chic Parisian-style bistro from renowned chef Paul Pairet, offering modern French comfort food with a playful twist. This stylish venue features:\n\n" +
                        "True French bistro classics reimagined with chef Pairet's signature creativity\n\n" +
                        "The famous 'Mimosa Egg' - a signature starter of egg, tuna and mayonnaise\n\n" +
                        "Casual yet sophisticated ambiance with indoor and terrace seating\n\n" +
                        "Artisanal bread baked fresh throughout the day\n\n" +
                        "Opened in 2017, Polux brings a slice of Parisian café culture to Shanghai's Xintiandi district. With its zinc bar, checkered floors and effortless elegance, it's become a favorite haunt for both expats and locals seeking authentic French flavors in a relaxed setting.",

                poluxImages, // Your image array
                "+86 21 5383 5757",
                "reservations@polux.cn",
                "No. 5-7, Lane 181 Taicang Road, Xintiandi, Shanghai",
                "www.polux-china.com"));

        /*
        // Arabic Description
                "مطعم فرنسي عصري من الشيف الشهير بول بيريه، يقدم أطباقاً فرنسية مريحة مع لمسة إبداعية. يتميز هذا المطعم الأنيق بـ:\n\n" +
                        "أكلات فرنسية كلاسيكية مع إعادة ابتكار بإسلوب الشيف بيريه المميز\n\n" +
                        "طبق البيض 'الميموزا' الشهير - بيض مع التونة والمايونيز\n\n" +
                        "أجواء عصرية راقية مع أماكن جلوس داخلية وفي الهواء الطلق\n\n" +
                        "خبز طازج يُخبز طوال اليوم\n\n" +
                        "افتتح عام 2017، يجلب بولوكس نكهة المقاهي الباريسية إلى منطقة شينتياندي في شنغهاي. مع باره المعدني وأرضيته المربعة وأناقته البسيطة، أصبح مكاناً مفضلاً للجاليات الأجنبية والمحليين الباحثين عن النكهات الفرنسية الأصيلة في أجواء مريحة.",

        * */

        // 4)  Lü Bo Lang - 6 images
        ArrayList<Integer> lubolangImages =new ArrayList<>();
        lubolangImages.add(R.drawable.lubolang1);
        lubolangImages.add(R.drawable.lubolang2);
        lubolangImages.add(R.drawable.lubolang6);
        lubolangImages.add(R.drawable.lubolang5);
        lubolangImages.add(R.drawable.lubolang3);
        lubolangImages.add(R.drawable.lubolang4);


        placesList.add(new Place("Lü Bo Lang ",
                "A legendary Shanghainese restaurant housed in a Ming Dynasty-style pavilion within Yuyuan Garden, serving imperial cuisine since 1979. This culinary landmark features:\n\n" +
                        "Authentic 'Ben Bang Cai' (Shanghainese home-style cooking) perfected over four decades\n\n" +
                        "The famous crab roe xiaolongbao - delicate dumplings bursting with rich crab essence\n\n" +
                        "Eight-hour braised crispy duck, a recipe unchanged since the restaurant's opening\n\n" +
                        "Elegant dining rooms overlooking the historic Huxinting Teahouse and koi ponds\n\n" +
                        "Frequented by world leaders and celebrities, Lü Bo Lang preserves Shanghai's gourmet heritage with its timeless recipes, traditional Chinese décor, and impeccable service in the heart of the Old City.",
                lubolangImages,
                "+86 21 6328 0602",
                "lubolangrestaurant@gmail.com",
                "115 Yuyuan Road",
                ""));

        /*
        *
         "مطعم شنغهايني أسطوري داخل جناح على طراز أسرة مينغ في حديقة يويوان، يقدم المأكولات الإمبراطورية منذ عام 1979. يتميز هذا المعلم الطهوي بما يلي:\n\n" +
        "أطباق 'بن بانغ تساي' الأصيلة (مطبخ شنغهاين المنزلي) التي أُتقنت على مدى أربعة عقود\n\n" +
        "زلابية كافيار السلطعون الشهيرة - قطع صغيرة تنفجر بنكهة السلطعون الغنية\n\n" +
        "بطة مقرمشة مطهوة لثماني ساعات، بنفس الوصفة منذ افتتاح المطعم\n\n" +
        "غرف طعام أنيقة تطل على بيت الشاي هوكسينتينج التاريخي وبركات الكوي\n\n" +
        "مكان مفضل لقادة العالم والمشاهير، يحافظ لو بو لانغ على التراث الطهوي لشنغهاي من خلال وصفاته الخالدة، ديكوره الصيني التقليدي، وخدمته الممتازة في قلب المدينة القديمة.",

        * */

        // 5)  ROOF - 6 images
        ArrayList<Integer> roofImages=new ArrayList<>();
        roofImages.add(R.drawable.roof1);
        roofImages.add(R.drawable.roof2);
        roofImages.add(R.drawable.roof3);
        roofImages.add(R.drawable.roof4);
        roofImages.add(R.drawable.roof5);
        roofImages.add(R.drawable.roof6);

        placesList.add(new Place("ROOF -The Shanghai EDITION-",
                "Shanghai's most glamorous rooftop destination, perched atop the EDITION Hotel with 270° views of the Bund and Pudong skyline. This chic venue offers:\n\n" +
                        "Modern Mediterranean cuisine with Japanese influences by Michelin-starred chefs\n\n" +
                        "Signature cocktails like the 'Jade Fizz' with Shanghai-inspired ingredients\n\n" +
                        "Three distinct areas: indoor lounge, open-air terrace, and private garden pods\n\n" +
                        "Live DJ sets creating a sophisticated yet vibrant atmosphere\n\n" +
                        "Opened in 2018, ROOF has become the ultimate sunset-to-starlight destination, where Shanghai's elite mingle against breathtaking views of the Huangpu River.",

                roofImages,
                "+86 21 5368 9999",
                "dining.shanghai@editionhotels.com",
                "The Shanghai EDITION, 199 Nanjing East Road",
                "www.editionhotels.com/shanghai/roof"));
/*
        "أكثر الوجهات الساحرة في شنغهاي، تطل من فوق فندق EDITION بإطلالة 270° على البوند وأفق بودونغ. تقدم هذه الوجهة الأنيقة:\n\n" +
                "مأكولات متوسطية معاصرة مع لمسات يابانية من طهاة حاصلين على نجوم ميشلان\n\n" +
                "كوكتيلات مميزة مثل 'جيد فيز' بمكونات مستوحاة من شنغهاي\n\n" +
                "ثلاث مناطق مختلفة: صالة داخلية، شرفة مفتوحة، وكبائن حدائقية خاصة\n\n" +
                "عروض دي جي حية تخلق أجواءً راقية ونابضة بالحياة\n\n" +
                "افتتح عام 2018، أصبح ROOF الوجهة المثالية من الغروب حتى النجوم، حيث تختلط نخبة شنغهاي مع إطلالات خلابة على نهر هوانغبو.",
*/

        // 6)  Yi Cafe - 5 images
        ArrayList<Integer> yicafeImages =new ArrayList<>();
        yicafeImages.add(R.drawable.yicafe4);
        yicafeImages.add(R.drawable.yicafe5);
        yicafeImages.add(R.drawable.yicafe2);
        yicafeImages.add(R.drawable.yicafe1);
        yicafeImages.add(R.drawable.yicafe3);

        placesList.add(new Place("Yi Cafe ",
                "A stylish all-day dining venue at The PuLi Hotel, offering an elegant blend of Western and Asian cuisine. Highlights include:\n\n" +
                        "• Famous weekend brunch buffet with live cooking stations\n\n" +
                        "• Signature black truffle roasted duck (limited daily)\n\n" +
                        "• Artisan breads and pastries baked in-house\n\n" +
                        "• Tranquil courtyard seating with water features\n\n" +
                        "• Award-winning wine selection by the glass",

                yicafeImages,
                "+86 21 6882 8888",
                "dining@thepuli.com",
                "The PuLi Hotel, 1 Changde Road",
                "www.thepuli.com/dining"));

        /*
        ,

                "مطعم أنيق للوجبات اليومية في فندق The PuLi، يقدم مزيجاً راقياً من المأكولات الغربية والآسيوية. أبرز ما يقدم:\n\n" +
                        "• بوفيه البرانش الشهير عطلات نهاية الأسبوع مع أطباق تطهى أمام الضيوف\n\n" +
                        "• البطة المشوية بالكمأة السوداء (كميات محدودة يومياً)\n\n" +
                        "• مخبوزات وحلويات طازجة تعد يومياً\n\n" +
                        "• أماكن جلوس هادئة في الفناء مع نوافير مائية\n\n" +
                        "• تشكيلة نبيذ حائزة على جوائز تقدم بالكأس",
        * */


        // 7)  Xin Guang - 5 images
        ArrayList<Integer> xinguangImages =new ArrayList<>();
        xinguangImages.add(R.drawable.xin_guang7);
        xinguangImages.add(R.drawable.xin_guang6);
        xinguangImages.add(R.drawable.xin_guang2);
        xinguangImages.add(R.drawable.xin_guang1);
        xinguangImages.add(R.drawable.xin_guang3);

        placesList.add(new Place("Xin Guang Restaurant ",
                "A historic Shanghainese institution since 1936, preserving pre-revolutionary flavors in its original Art Deco setting. Famous for:\n\n" +
                        "• Beggar's Chicken - clay-baked whole chicken with secret spice blend\n\n" +
                        "• Lion's Head Meatballs - giant pork meatballs in brown sauce\n\n" +
                        "• Vintage 1930s elevator still in operation\n\n" +
                        "• Sixth-floor views of Nanjing Road pedestrian street\n\n" +
                        "• Traditional 'Ben Bang' breakfast items until 10:30 AM",
                xinguangImages,
                "+86 21 6322 3978",
                "No email",
                "512 Tianjin Rd, Huangpu, Shanghai",
                "None"));

        /*
        *

                "مطعم تاريخي تأسس عام 1936، يحافظ على نكهات ما قبل الثورة في ديكوره الأصلي على طراز آرت ديكو. يشتهر بـ:\n\n" +
                        "• دجاج الشحاذ - دجاج كامل مشوي بالطين بمزيج سري من التوابل\n\n" +
                        "• كرات لحم رأس الأسد - كرات لحم خنزير عملاقة في صلصة بنية\n\n" +
                        "• مصعد أصلي من الثلاثينيات لا يزال يعمل\n\n" +
                        "• إطلالة من الطابق السادس على شارع نانجينغ للمشاة\n\n" +
                        "• وجبات إفطار 'بن بانغ' التقليدية حتى 10:30 صباحاً",
        *
        * */


        // 8)  SongYue Lou - 5 images
        ArrayList<Integer> songyuelouImages =new ArrayList<>();
        songyuelouImages.add(R.drawable.songyuelou1);
        songyuelouImages.add(R.drawable.songyuelou2);
        songyuelouImages.add(R.drawable.songyuelou3);
        songyuelouImages.add(R.drawable.songyuelou4);
        songyuelouImages.add(R.drawable.songyuelou5);
       // songyuelouImages.add(R.drawable.songyuelou6);
        songyuelouImages.add(R.drawable.songyuelou7);
        songyuelouImages.add(R.drawable.songyuelou8);
        songyuelouImages.add(R.drawable.songyuelou9);

        placesList.add(new Place("Songyuelou ",
                "Founded in 1910, this Buddhist vegetarian restaurant near City God Temple preserves Qing Dynasty culinary traditions. Renowned for:\n\n" +
                        "• **Vegetarian 'Goose'** - 20-layer tofu skin marinated in secret sauce (¥68)\n\n" +
                        "• **Mushroom 'Eel'** - King oyster mushrooms carved to mimic river eel (¥88)\n\n" +
                        "• **Century-Old Mooncakes** - Made with temple recipe since 1910 (¥28/piece)\n\n" +
                        "• **Original Wooden Courtyard** - With carved Buddhist motifs and stone well\n\n" +
                        "• **Morning Monk's Breakfast** - Steamed buns with herbal congee (6-9AM only)",

                songyuelouImages,
                "+86 21 6355 3630",
                "",
                "99 Jiujiaochang Rd, Huangpu, Shanghai",
                ""));

        /*

                "تأسست عام 1910، هذا المطعم النباتي البوذي قرب معبد المدينة يحافظ على تقاليد الطهي من عهد تشينغ. تشتهر بـ:\n\n" +
                        "• 'إوز نباتي' - 20 طبقة من جلد التوفو متبلة بصلصة سرية (68 ¥)\n\n" +
                        "• 'ثعبان نباتي' - فطر المحار الملكي منحوت على شكل ثعبان النهر (88 ¥)\n\n" +
                        "• كعكات القمر التاريخية - بوصفة معبدية منذ 1910 (28 ¥ للقطعة)\n\n" +
                        "• فناء خشبي أصلي - بنقوش بوذية وبئر حجرية\n\n" +
                        "• إفطار الرهبان الصباحي - كعكات بخارية مع عصيدة أعشاب (6-9 صباحاً فقط)",


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

            Intent intent = new Intent(RestaurantsActivity.this, DescriptionActivity.class);
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

