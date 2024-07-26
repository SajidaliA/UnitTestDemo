package com.example.unittestdemo

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.gson.JsonSyntaxException
import org.junit.Assert.*

import org.junit.Test
import java.io.FileNotFoundException

class QuoteManagerTest {

    @Test(expected = FileNotFoundException::class)
    fun populateQuoteFromAsset() {
        val quoteManager = QuoteManager()
        val context = ApplicationProvider.getApplicationContext<Context>()
        quoteManager.populateQuoteFromAsset(context, "")
    }

    @Test(expected = JsonSyntaxException::class)
    fun testPopulateQuoteFromAsset() {
        val quoteManager = QuoteManager()
        val context = ApplicationProvider.getApplicationContext<Context>()
        quoteManager.populateQuoteFromAsset(context, "test.json")
    }

    @Test
    fun testPopulateQuoteFromAsset_ValidJson_expected_count() {
        val quoteManager = QuoteManager()
        val context = ApplicationProvider.getApplicationContext<Context>()
        quoteManager.populateQuoteFromAsset(context, "Quote.json")
        assertEquals(102, quoteManager.quoteList.size)
    }

    @Test
    fun testPreviousQuote_expected_correctQuote(){
        val quoteManager = QuoteManager()
        quoteManager.populateQuote(arrayOf(
            Quote("This is a test quote", "1"),
            Quote("This is a test quote", "2"),
            Quote("This is a test quote", "3")
        ))
        val quote = quoteManager.getPreviousQuote()
        assertEquals("1", quote.author)
    }

    @Test
    fun testNextQuote_expected_correctQuote(){
        val quoteManager = QuoteManager()
        quoteManager.populateQuote(arrayOf(
            Quote("This is a test quote", "1"),
            Quote("This is a test quote", "2"),
            Quote("This is a test quote", "3")
        ))
        val quote = quoteManager.getNextQuote()
        assertEquals("2", quote.author)
    }
}