# Arabuluculuk Ücret Hesaplama 2023

Programda if-else yapısını kullanarak çok temel, basit bir arabuluculuk ücreti hesaplama programı yaptık.

İlerde nesne mantığını kullanarak düzenlenecektir veya algoritması daha basit şekile indirgenecektir.

Ayrıca diğer ihtimaller de programımıza eklenecektir. Şöyle ki;
Bu hesaplama iş hukuku uyuşmazlıkları için geçerlidir ve sadece 2 kişi katılımında geçerlidir. Katılım yani anlaşan kişi sayısını arttırdığımızda özellikle asgarisini yani 1.600.00TL'yi baz aldığımızda savcılıkça ödenecek miktar değişmektedir. Ayrıca tüketici veya ticari uyuşmazlıklarda da asgari miktar değişmektedir. Ancak genel itibariyle asgarinin üzerinde bir ücret hesaplamasında bu basit program her zaman doğru sonucu verecektir. 

Hesaplama Şu mantıkla Yapılmaktadır;

1- Kullanıcıdan anlaşma miktarını alıyoruz.
2- Anlaşma miktarına göre belirli oranlarda arabuluculuk ücreti hesaplaması yapıyoruz ancak öncelikle anlaşma miktarı 0'dan büyük olmalıdır.
3- Daha sonra arabuluculuk ücreti 2023 yılı itibariyle 1.600,00 TL'den düşük olmamalıdır.
4- anlaşma miktarının ilk 50.000 TL'si için %6 oranında arabuluculuk ücreti hesaplanır.
```
Örnek-1: 
Anlaşma miktarınız: 10.000,00 TL
Arabuluculuk ücreti: 600,00TL değil 1.600,00TL'dir. (Çünkü % 6 olarak hesaplansa da 1.600,00TL'nin altına düşülmeyecektir.)
```
```
Örnek-2: 
Anlaşma miktarınız: 30.000,00TL
Arabuluculuk ücreti: 1.800TL'dir.
(Çünkü % 6 oranda hesaplama yaptığımızda 1.600,00TL'nin üzerinde çıktığından çıkan rakam ücretimiz oluyor.)
```

5- Anlaşma miktarının ilk 100.000,00 TL'si için %6, sonraki 160.000,00 TL'si için %5, sonraki 260.000,00 TL'si %4, sonraki 520.000,00 TL'si için %3 vd. şeklinde aşağıdaki tabloda görülmektedir.

| Sayı | Anlaşılan Miktar | Oran|
|------|-------------------|----|
| 1. | İlk 100.000,00 TL’si için | %6 |
| 2. | Sonra gelen 160.000,00 TL'si için | %5 |
| 3. | Sonra gelen 260.000,00 TL'si için | %4 |
| 4. | Sonra gelen 520.000,00 TL'si için | %3 |
| 5. | Sonra gelen 1.560.000,00 TL'si için | %2 |
| 6. | Sonra gelen 2.080.000,00 TL'si için | %1,5 |
| 7. | Sonra gelen 4.160.000,00 TL'si için | %1 |
| 8. | 8.840.000,00 TL'den yukarısı için | %0,5 |
