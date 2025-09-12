# hide-privacy-indicator
<img width="1287" height="965" alt="image" src="https://github.com/user-attachments/assets/a99101a8-4607-49d3-8356-2abc480dc0ae" />


## 概要
- 超音波式画面内指紋認証の端末において、GSIでは正しく方式を特定できず？光学式として扱われてしまい、画面がフラッシュすることを防ぎます。
## 詳細
`com.android.systemui.biometrics.UdfpsController`内の
- `isOptical`の戻り値を`false`に
- `isUltrasonic`の戻り値を`true`に
書き換えます。
## 動作確認
- SAMSUNG Galaxy S21(SCG09): [DerpFest 14](https://github.com/KoysX/treble_DerpFest_GSI/releases/tag/v2024.02.12)
## ライセンス
The Unlicense
