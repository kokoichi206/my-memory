## Memory game
- Kotlin
- Dynamic layouts
- Multi-screen navigation
- Image loading
- Persistence with Firebase
- [youtube](https://www.youtube.com/watch?v=C2DBDZKkLss)

### RecyclerView
- LayoutManager
  - measures and positions item views
- Adapter
  - provide a bindign for the data set to the views of the RecyclerView
- overScrollMode

### LayoutInflater
What is inflater ???

### Choosing icons
- Distinct shapes
- Distinct colors

### Cloud Firestore AND Cloud Storage
- Cloud storage に、非同期で保存する
- その後に、Cloud Firestore に、次の２つを登録する
  - customGameName, uploadedImageUrls
- addOnCompleteListener
  - 非同期でどんどん呼ばれる、順番は指定できない


### ProgressBar
- Uploading の時だけ見えるようにしたい
  - Visibility: Gone

### Image downloading
- [picasso](https://github.com/square/picasso)
  - A powerful image downloading and caching library for Android

```java
Picasso.get().load(memoryCard.imageUrl).into(imageButton)
Picasso.get().load(memoryCard.imageUrl).placeholder(R.drawable.ic_image).into(imageButton)
```

### Extension ideas
- Add different board sizes
- See all my custom boards after user authentication
- Discovery of other people's boards

### Before releasing your app:
1. Create a custom app icon
  1. drawable -> new -> imageAsset
2. Turn on minify (Proguard) in build.gradle
  1. To downsize the app
3. Add Analytics
4. Test on phones of various API versions
5. Consider translating strings



### Memo
- `Log.i(TAG, "Clicked on position $position")`
- xml file
  - the size of xml file image is small!!
  - scalable!
- val, var
  - val cannot be changed
  - var can be changed
- !!
  - ignore nullable var
  - only if you know it's not null
- .map ????
- bind のイメージ？
  - holder.bind(position)
- Snackbar
  - show up from the bottom
- cast
  - as Int, などでキャストしてるんだと思う
- menu
  - Menu Item
  - showAsAction で、Always を選ぶと、選択肢が降りてくるのではなく、常に選べるやつになる
- よくあるスペースの調整？
  - width: match_parent
  - height: wrap_content
  - gravity: center
- 上下の移動で、シャドウが出ないようにする
  - overScrollMode = never
  - RecyclerView など
- Permissions:
  - Normal:
    - data access with little risk to user's privacy
    - INTERNET
  - Dangerous:
    - data access that involves user's private information
    - Manifest だけでは不十分！
      - コード内でもなんか書く必要がある！




