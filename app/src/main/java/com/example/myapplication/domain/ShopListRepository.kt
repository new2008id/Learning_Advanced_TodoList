package com.example.myapplication.domain

import androidx.lifecycle.LiveData

interface ShopListRepository {
    fun addShopItem(shopItem: ShopItem)
    fun editShopItem(shopItem: ShopItem)
    fun getShopItemById(shopItemId: Int): ShopItem
    fun removeShopItem(shopItem: ShopItem)
    fun getShopList(): LiveData<List<ShopItem>>
}