package br.com.danilo.drogaria.main;

import org.hibernate.Session;

import br.com.danilo.drogaria.util.HibernateUtil;

public class HibernateUtilTest {

	public static void main(String[] args) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		sessao.close();
		HibernateUtil.getFabricaDeSessoes().close();

	}

}
